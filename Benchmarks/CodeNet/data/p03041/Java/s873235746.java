import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int K = in.nextInt();
            StringBuilder S = new StringBuilder(in.next());
            S.replace(K - 1, K, S.substring(K - 1, K).toLowerCase());
            System.out.println(S);
        }
    }
}
