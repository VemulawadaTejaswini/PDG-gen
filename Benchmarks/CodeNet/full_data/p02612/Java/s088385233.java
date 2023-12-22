import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                N %= 1000;

                if (N == 0) {
                	N = 1000;
                }

                System.out.println(1000 - N);

                scan.close();

        }
}