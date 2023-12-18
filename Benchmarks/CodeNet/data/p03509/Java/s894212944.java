import java.util.Scanner;
import java.util.stream.LongStream;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        long P = scan.nextLong();
        long[] w = new long[N];
        long[] b = new long[N];
        for(int i=0;i<N;++i){
            w[i] = scan.nextLong();
            b[i] = scan.nextLong();
        }
        long[] wb = LongStream.range(0,N).map(i -> (100-P)*w[(int)i] + P*b[(int)i]).sorted().toArray();
        long sum = 0;
        long X = LongStream.range(0,N).map(i -> b[(int)i]).sum();
        for(int i=1;i<=N;++i){
            sum += wb[N-i];
            if(sum >= P*X){
                System.out.println(i);
                break;
            }
        }

    }
}