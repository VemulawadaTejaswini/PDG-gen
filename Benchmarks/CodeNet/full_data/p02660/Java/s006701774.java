import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int count = 0;
        for (int i = 2;;i++) {
            if (N == 1) {
                System.out.println(count);
                return;
            } 
            boolean prime = true;
            for (int j = 2; j < Math.sqrt(N); j++) {
                if (N%j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(count+1);
                return;
            }
            if (N%i == 0) {
                N /= i;
                count++;
            } else {
                continue;
            }
        }
    }
}