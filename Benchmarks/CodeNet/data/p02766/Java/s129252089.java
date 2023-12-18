import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int c = 0;
            while (N > 0) {
                N = (N / K);
                c++;
            }

            System.out.println(c);
        }
    }

}
