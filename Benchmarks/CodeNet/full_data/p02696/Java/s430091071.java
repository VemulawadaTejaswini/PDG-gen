import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long N = sc.nextLong();
        if (N < B) {
            long f = (A * N)/B;
            long b = N/B;
        	System.out.println(f - A * b);
        } else {
        	N = B-1;
            long f = (A * N)/B;
            long b = N/B;
        	System.out.println(f - A * b);
        }
    }
}