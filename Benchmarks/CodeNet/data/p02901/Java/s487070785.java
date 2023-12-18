import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte(){
        if(ptr < buflen){
            return true;
        }else{
            ptr = 0;
            try{
                buflen = in.read(buffer);
            }catch(IOException e){
                e.printStackTrace();
            }
            if(buflen <=0){
                return false;
            }
        }
        return true;
    }

    private int readByte(){
        if(hasNextByte())return buffer[ptr++];
        else return -1;
    }

    private static boolean isPrintableChar(int c){
        return 33<=c && c<=126;
    }
    public boolean hasNext(){
        while(hasNextByte() && !isPrintableChar(buffer[ptr]))ptr++;
        return hasNextByte();
    }

    public String next(){
        if(!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)){
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong(){
        if(!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if(b == '-'){
            minus = true;
            b = readByte();
        }
        if(b < '0' || '9' < b){
            throw new NumberFormatException();
        }
        while(true){
            if('0' <= b && b<='9'){
                n*=10;
                n+=b-'0';
            }else if(b==-1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt(){
        long nl = nextLong();
        if(nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDoutble(){return Double.parseDouble(next());}
}
public class Main {
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int m = fs.nextInt();
        int[][] a = new int[m][2];
        int b;
        int[] keys = new int[m];
        int[] treasure = new int[n];
        int c;
        long sum = 0;
        for(int i=0;i<m;i++){
            a[i][0] = fs.nextInt();
            sum+=a[i][0];
            a[i][1] = i;
            b= fs.nextInt();
            int keybit = 0;
            for(int j=0;j<b;j++){
                c = fs.nextInt();
                treasure[c-1]++;
                keybit|=(1<<(c-1));
            }
            keys[i] = keybit;
        }
        for(int i=0;i<n;i++)if(treasure[i]==0){
            System.out.println(-1);
            return;
        }
        Arrays.sort(a,new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        boolean flag ;
        for(int i=0;i<m;i++){
            c = keys[a[i][1]];
            flag = true;
            for(int j=0;j<n;j++){
                if((((c>>j)&1))==1 && treasure[j]<=1){
                    flag = false;
                    break;
                }
            }
            if(flag){
                
                sum-=a[i][0];
                for(int j=0;j<n;j++){
                    if((((c>>j)&1))==1){
                        treasure[j]--;
                    }
                }
            }
        }
        System.out.println(sum);



    }
    
}