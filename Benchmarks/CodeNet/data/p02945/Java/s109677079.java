import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            int ans = Math.max(Math.max(A + B, A - B), A * B);

            System.out.println(ans);
        }
    }

}
