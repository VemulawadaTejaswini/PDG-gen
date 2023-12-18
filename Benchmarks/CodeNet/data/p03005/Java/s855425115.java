import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        int N = 0;
        int K = 0;
        try (Scanner scan = new Scanner(System.in);) {
            N = scan.nextInt();
            K = scan.nextInt();
        }

        if (K == 1) {
            System.out.println(0);
        } else {
            System.out.println(N - K);
        }

    }
}