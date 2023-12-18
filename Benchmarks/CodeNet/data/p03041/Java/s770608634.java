import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        String ans = solve(N, K, S);

        System.out.println(ans);
    }

    private static String solve(int N, int K, String S) {
        char[] sarray = S.toCharArray();

        sarray[K-1] = (char)(sarray[K-1] - ('A' - 'a'));

        return new String(sarray);
    }
}
