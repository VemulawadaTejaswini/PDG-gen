import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long K;
        Scanner sc = new Scanner(System.in);
        K = sc.nextLong();
        Long bank = 100L;
        int toshi = 0;
        while( bank < K )
        {
            bank = (long)(bank * 1.01);
            toshi++;
        }
        System.out.println(toshi);
    }
}
