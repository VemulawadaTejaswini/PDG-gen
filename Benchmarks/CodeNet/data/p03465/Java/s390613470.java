import java.util.BitSet;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A  =IntStream.range(0,N).map(i->scan.nextInt()).toArray();
        BitSet bs = new BitSet(2000*N+1);
        bs.set(N*2000);
        int sum=0;
        for(int i=0;i<N;++i){
            bs.or(bs.get(A[i],2000*N+1));
            sum+=A[i];
        }
        int k = (sum+1)/2;
        int d = bs.previousSetBit(2000*N-k);
        System.out.println(2000*N-d);
    }
}