import java.util.Scanner;

public class Main {

    public static boolean echo(int N, String str) {
        if (N % 2 == 1) return false;
        for (int i = 0; i < N / 2; i++) {
            if (str.charAt(i) != str.charAt(N / 2 + i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        System.out.println(echo(N, S) ? "Yes" : "No");
        in.close();
    }
}

