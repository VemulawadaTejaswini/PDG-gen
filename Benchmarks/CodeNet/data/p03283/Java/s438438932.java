
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    static int N,M,Q;
    static List<Pair> LR,Query;
    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        N=scanner.nextInt();
        M=scanner.nextInt();
        Q=scanner.nextInt();
        LR=new ArrayList<>();
        Query=new ArrayList<>();
        for(int i=0;i<M;i++){
            int l=scanner.nextInt()-1;
            int r=scanner.nextInt()-1;
            LR.add(new Pair(l,r));
        }
        for(int i=0;i<Q;i++){
            int p=scanner.nextInt()-1;
            int q=scanner.nextInt()-1;
            Query.add(new Pair(p,q));
        }
        Comparator<Pair> comparator=Comparator.comparing(Pair::getY)
                .thenComparing(Comparator.comparing(Pair::getX));
        Collections.sort(LR,comparator);
        List<Pair> q=new ArrayList<>(Query);
        Collections.sort(Query,comparator);
        //put(LR);
        //put(Query);
        int LRIndex=0;
        int QIndex=0;
        long[] nums = new long[N];
        SegmentTree.SumSegmentTree st = new SegmentTree.SumSegmentTree(nums);
        Map<Pair,Long> result=new HashMap<>();
        while(true){
            //put(st);
            if(QIndex==Query.size()) break;
            if(LRIndex==LR.size()){
                Pair target= Query.get(QIndex);
                result.put(target,st.getVal(target.getX(),target.getY()));
                QIndex++;
                continue;
            }else{
                Pair targetLR=LR.get(LRIndex);
                Pair targetQuery=Query.get(QIndex);
                if(targetLR.getY()<=targetQuery.getY()){
                    Pair target=targetLR;
                    st.setVal(target.getX(),st.getVal(target.getX())+1);
                    LRIndex++;
                }else{
                    Pair target=targetQuery;
                    result.put(target,st.getVal(target.getX(),target.getY()));
                    QIndex++;
                }
            }
        }
        for(Pair pair:q){
            put(result.get(pair));
        }

    }

    public static void put(Object object){
        System.out.println(object);
    }
    public static String format(String string,Object... args){
        return String.format(string,args);
    }

    public static class Pair{
        final public int x,y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
        @Override
        public String toString(){
            return format("(%d,%d)",x,y);
        }
    }

    public static abstract class SegmentTree  {
        public static void main(String[] args) {
            long[] nums = {3,4,2,2,5,1,1,4,2,2,-4,-2,-1,0,0,0,0,0};
            SumSegmentTree st = new SumSegmentTree(nums);
            st.setVal(4,-3);
            put(st.getVal(4,5));
            MinSegmentTree minSt=new MinSegmentTree(nums);
            minSt.setVal(4,-3);
            put(minSt.getVal(2,4));
            MaxSegmentTree maxSt=new MaxSegmentTree(nums);
            maxSt.setVal(4,-3);
            put(maxSt.getVal(2,5));
            put(st);
            put(minSt);
            put(maxSt);
        }
        protected final int originSize;
        protected final int height;
        protected final long[] node;
        protected final long noRelationVal;

        protected SegmentTree (long[] original,long noRelationVal){
            this.noRelationVal=noRelationVal;
            originSize = original.length;
            {
                int height_ = 1;
                while (originSize > (1 << (height_ - 1))) {
                    height_++;
                }
                height = height_;
            }
            this.node = new long[ (1<<height)-1];
            //まず元の配列に対応する部分のnodeを埋める
            for(int i=0;i<originSize;i++){
                this.node[(1<<(height-1))-1+i]=original[i];
            }
            for(int i=(1<<(height-1))-1+originSize;i<(1<<height)-1;i++){
                this.node[i]=noRelationVal;
            }
            //空いているnodeを後ろから埋めていく
            for(int i = (1<<(height-1))-2; i>=0; i--){
                this.node[i]=marge(this.node[i*2+1],this.node[i*2+2]);
            }
        }
        public long getVal(int a,int b){
            return getVal(a,b,0,0,-1);
        }
        public long getVal(int a, int b, int k, int l, int r) {
            //node[k]=origin上の範囲[l,r]の合計を表している
            //put(format("%d,%d,%d,%d,%d",a,b,k,l,r));
            if(r < 0) r = (1<<(height-1))-1;
            if(b<l||r<a) return noRelationVal;
            if(a <= l && r <= b) return node[k];

            long vl = getVal(a, b, 2*k+1, l, (l+r)/2);
            long vr = getVal(a, b, 2*k+2, (l+r)/2+1, r);
            return marge(vl,vr);
        }
        public long getVal(int index){
            return node[(1<<(height-1))-1+index];
        }

        void setVal(int index,long val){
            if(index<0||index>=originSize) throw new IllegalArgumentException(format("挿入位置が不正%d",index));
            index=(1<<(height-1))-1+index;
            node[index]=val;
            while(index>0){
                index=(index-1)/2;
                node[index]=marge(node[2*index+1],node[2*index+2]);
            }
        }
        public abstract long marge(long a,long b);
        @Override
        public String toString(){
            StringBuilder result=new StringBuilder();
            result.append(format("Class:%s\n",getClass().getSimpleName()));
            result.append(format("height:%d\n",height));
            for(int currentHeight=1;currentHeight<=height;currentHeight++){
                for(int i=(1<<(currentHeight-1))-1;i<=(1<<currentHeight)-2;i++){
                    result.append(format("%d ",node[i]));
                }
                result.append("\n");
            }
            return result.toString();
        }


        public static final class SumSegmentTree extends  SegmentTree{
            SumSegmentTree(long[] original){
                this(original,0);
            }
            SumSegmentTree(long[] original,long noRelationVal){
                super(original,noRelationVal);
            }

            @Override
            public long marge(long a, long b) {
                return a+b;
            }
        }
        public static final class MinSegmentTree extends SegmentTree{
            MinSegmentTree(long[] original){
                this(original,Long.MAX_VALUE);
            }
            MinSegmentTree(long[] original,long noRelationVal){
                super(original,noRelationVal);
            }

            @Override
            public long marge(long a, long b) {
                return Math.min(a,b);
            }

        }
        public static final class MaxSegmentTree extends  SegmentTree{
            MaxSegmentTree(long[] original){
                this(original,-Long.MIN_VALUE);
            }
            MaxSegmentTree(long[] original,long noRelationVal){
                super(original,noRelationVal);
            }

            @Override
            public long marge(long a, long b) {
                return Math.max(a,b);
            }
        }
    }
    final static class Scanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte())
                return buffer[ptr++];
            else
                return -1;
        }

        private boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr]))
                ptr++;
            return hasNextByte();
        }

        public String next() {
            if (!hasNext())
                throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        public long nextLong() {
            if (!hasNext())
                throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
                throw new NumberFormatException();
            return (int) nl;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}
