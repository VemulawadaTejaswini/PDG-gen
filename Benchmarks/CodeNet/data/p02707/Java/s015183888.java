import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);

                int N = scan.nextInt();

                int[] buka = new int[N];

                for (int i = 0; i < N-1; i++) {
                	int temp = scan.nextInt();
                	buka[temp-1]++;
                }

                scan.close();

                for (int output: buka) {
                	System.out.println(output);
                }

        }

}