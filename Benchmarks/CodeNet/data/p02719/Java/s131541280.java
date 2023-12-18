import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long min = N;
        if(N<K || N == 0)
        {
            System.out.println(N);
        }
        else if(K == 0 || N % K == 0)
        {
            System.out.println(0);
        }
        else
        {
            long shou = N / K;
            long sa1 = N - shou * K;
            long sa2 = (sa1 - K) * (-1);
            if(sa1<min)
            {
                min = sa1;
            }
            if(sa2<min)
            {
                min = sa2;
            }
            System.out.println(min);
        }
    }
}
