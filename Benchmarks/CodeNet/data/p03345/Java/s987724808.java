import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        final long A = sc.nextLong();
        final long B = sc.nextLong();
        final long C = sc.nextLong();
        long K = sc.nextLong();
        
        long ans = 0L;
        if (K == 0) {
        	ans = A - B;
        } else if (K == 1) { 
        	ans = B - A;
        } else if (K % 2 == 0) {
        	ans = B - A;
        } else {
        	ans = A - B;
        }
        if (ans > 100_000_000_000_000_000L) {
        	System.out.println("Unfair");
        } else {
            System.out.println(ans);
        }
    }
}