import java.util.*;
import java.io.*;

class Main{
    static int n;
    static int[][] ud;
    public static void main(String[] args){
        FastScanner fsc=new FastScanner();
        n=fsc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            a[i]=fsc.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=fsc.nextInt();
        }
        fsc.close();
        ud=new int[n+1][1<<n];
        for(int i=1;i<=n;i++){
            for(int j=0;j<(1<<i);j++){
                if(j==0){
                    ud[i][j]=0;
                } else{
                    ud[i][j]=-1;
                }
            }
            ArrayDeque<IJK> dq=new ArrayDeque<>();
            dq.add(new IJK(i, 0, 0));
            while(!dq.isEmpty()){
                IJK ijk=dq.pollFirst();
                for(int bt=0;bt<i-1;bt++){
                    int l=ijk.j&(1<<(bt+1));
                    int r=ijk.j&(1<<bt);
                    int mask=(1<<(bt+1))+(1<<bt);
                    if((r<<1)==l && ud[ijk.i][ijk.j^mask]<0){
                        ud[ijk.i][ijk.j^mask]=ijk.k+1;
                        dq.addLast(new IJK(ijk.i, ijk.j^mask, ijk.k+1));
                    }
                }
            }
        }
        // for(int i=1;i<=n;i++){
        //     for(int j=0;j<(1<<i);j++){
        //         String jbin=String.format("%0"+i+"d", Long.valueOf(Integer.toString(j, 2))); 
        //         System.out.print("ud["+i+"]["+jbin+"]: "+ud[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        int max=Integer.MAX_VALUE;
        int min=max;
        L:for(int i=0;i<(1<<n);i++){
            boolean[] slcta=new boolean[n];
            int[] res=new int[n];
            BinaryIndexedTree bit=new BinaryIndexedTree(50);
            for(int bt=0;bt<n;bt++){
                slcta[bt]=(i&(1<<bt))!=0;
                res[bt]=slcta[bt]?a[bt]:b[bt];
            }
            int inversion=0;
            int cnt=0;
            int cond=0;
            for(int j=0;j<n;j++){
                inversion+=bit.sum(res[j], 50);
                if((slcta[j] && (bit.sum(res[j])-j)%2!=0) ||
                    (!slcta[j] && (bit.sum(res[j])-j)%2==0)){
                    cond+=1<<cnt;
                }
                if(j==n-1){
                    if(ud[cnt+1][cond]>=0){
                        min=Math.min(min, inversion+=ud[cnt+1][cond]);
                    }
                } else if(res[j]!=res[j+1]){
                    if(ud[cnt+1][cond]>=0){
                        inversion+=ud[cnt+1][cond];
                    } else{
                        continue L;
                    }
                    cnt=0;
                } else if(res[j]==res[j+1]){
                    cnt++;
                }
                bit.add(res[j], 1);
            }
        }
        System.out.println(min<max?min:-1);
    }

    static class IJK{
        int i, j, k;
        IJK(int i, int j, int k){
            this.i=i; this.j=j;this.k=k;
        }
    }

    static class BinaryIndexedTree{
        private int[] bit;
        private int[] originalArray;
        private int n;
        /**
         * @param array 0-indexed array.
         */
        public BinaryIndexedTree(int[] array){
            this.originalArray=array.clone();
            this.n=array.length;
            this.bit=new int[n+1];
            init();
        }
        public BinaryIndexedTree(int initial, int n){
            this.originalArray=new int[n];
            this.n=n;
            this.bit=new int[n+1];
            for(int i=0;i<n;originalArray[i++]=initial);
            init();
        }
        public BinaryIndexedTree(int n){
            this(0, n);
        }
        private void init(){
            for(int i=1;i<=n;i++){
                bit[i]+=originalArray[i-1];
                if(i+(-i&i)<=n){
                    bit[i+(-i&i)]+=bit[i];
                }
            }
        }
    
        /**
         * Calculate the sum of range (l, r] in array (1-indexed).
         * @param l left border (open)
         * @param r right border (closed)
         * @return sum of range (l, r] in array (1-indexed).
         */
        public int sum(int l, int r){
            return sum(r)-sum(l);
        }
        public int sum(int r){
            int ret=0;
            for(;r>0;r-=-r&r){
                ret+=bit[r];
            }
            return ret;
        }
        public int sum(){
            return sum(n);
        }
    
        /**
         * add v to array[i] and update BIT.
         * @param i index of array (1-indexed)
         * @param v adding value
         */
        public void add(int i, int v){
            originalArray[i-1]+=v;
            for(;i<=n;i+=-i&i){
                bit[i]+=v;
            }
        }
    
        /**
         * update the value of array[i] to v and update BIT.
         * @param i index of array (1-indexed)
         * @param v adding value
         */
        public void update(int i, int v){
            add(i, v-originalArray[i-1]);
            originalArray[i]=v;
        }
    
        @Override
        public String toString(){
            int msb=0;
            for(int m=n;m>>1!=0;m>>=1, msb++);
            char[][] c=new char[msb+1][1<<(2*msb+1)];
            int[] indx=new int[msb+1];
            for(int i=1;i<=n;i++){
                int j=0;
                for(int l=-i&i;l>>1!=0;l>>=1, j++);
                char[] intc=Integer.toString(bit[i]).toCharArray();
                int intl=intc.length;
                c[j][indx[j]]='[';
                c[j][indx[j]+(1<<(j+2))-1]=']';
                int st=indx[j]+(1<<(j+1))-intl/2-1;
                for(int l=0;l<intl;l++){
                    c[j][st+l]=intc[l];
                }
                indx[j]+=1<<(j+3);
            }
            StringBuilder sb=new StringBuilder();
            for(int i=msb;i>=0;sb.append(String.valueOf(c[i--])).append("\n"));
            return sb.toString();
        }
    }
    
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;
        private boolean hasNextByte(){
            if(ptr<buflen) return true;
            else{
                ptr = 0;
                try{
                    buflen = in.read(buffer);
                }
                catch(IOException e){
                    e.printStackTrace();
                }
                if(buflen<=0) return false;
            }
        return true;
        }
        private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
        private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
        public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
        public String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while(isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }
        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) throw new NumberFormatException();
            while(true){
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                }
                else if(b == -1 || !isPrintableChar(b)) return minus ? -n : n;
                else throw new NumberFormatException();
                b = readByte();
            }
        }
        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }
        public double nextDouble() { return Double.parseDouble(next());}
        public void close(){
            try{in.close();}
            catch(IOException e){e.printStackTrace();}
        }
    }
}
