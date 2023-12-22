import java.util.Iterator;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//nCrのnにあたる
        int M=sc.nextInt();   //nCrのrにあたる
        int Q=sc.nextInt();
        int[][] qs=new int[Q][4];
        for(int i=0; i<Q; i++){
            for(int j=0; j<4; j++){
                qs[i][j]=sc.nextInt();
            }
        }
        long max = 0;
        for (long l : new Combination(N+M,N)) {
            int[] a=vconv(l,N);
            long tmp=0;
            if(a[0] != 0) {
                //l(a);
                for(int j =0; j<Q; j++){
                    if(a[qs[j][1]-1] - a[qs[j][0]-1] == qs[j][2]){
                        tmp+=qs[j][3];
                    }
                }
                max = Math.max(max,tmp);
            }
        }
        System.out.println(max);
    }
    static int[] vconv(long l,int N){
        int[] ret =new int[N];
        for(int i=0; i<N; i++){
            ret[i] = 0;
        }
        int tmp=0;
        int counter=0;
        while(l > 0 ){
            if( l % 2 == 0){
                counter++;
                l /=2;
            }else{
                ret[tmp]=counter;
                tmp++;
                l /=2;
            }
        }
        return ret;
    }
    static void l(int[] k){
        for(int i=0; i<k.length; i++){
            System.out.print(k[i]+" ");
        }
        System.out.println();
    }

    private static class Combination implements Iterable<Long> {
        private final int max;
        private final int select;
        public Combination(int max, int select) {
            if (max < 1 || 62 < max) {
                throw new IllegalArgumentException();
            }
            this.max = max;
            this.select = select;
        }
        public Iterator<Long> iterator() {
            return new CombinationIterator(max, select);
        }
    }
    private static class CombinationIterator implements Iterator<Long> {
        private long value;
        private final long max;

        public CombinationIterator(int max, int select) {
            this.value = (1L << select) - 1L;
            this.max = 1L << max;
        }
        public boolean hasNext() {
            return value < max;
        }
        public Long next() {
            long stock = value;
            value = next(value);
            return stock;
        }
        public void remove() {
            throw new UnsupportedOperationException();
        }
        private long next(long source) {
            long param1 = smallestBitOf(source);
            long param2 = param1 + source;
            long param3 = smallestBitOf(param2);
            long param5 = (param3 / param1) >>> 1;
            return param5 - 1 + param2;
        }
        private long smallestBitOf(long source) {
            long result = 1L;
            while (source % 2 == 0) {
                source >>>= 1;
                result <<= 1;
            }
            return result;
        }
    }
}
