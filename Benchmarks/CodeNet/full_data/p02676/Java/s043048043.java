import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = Integer.parseInt(sc.next());
        String S = sc.next();

        if (S.length() <= K) {
            System.out.println(S);
            return;
        }
        S = S.substring(0, K);
        System.out.println(S + "...");

    }
}
