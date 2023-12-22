import java.util.Scanner;

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int K;
        String S;

        K = input.nextInt();
        S = input.next();

        System.out.println(S.substring(0,K) + "...");
    }
}
