import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String T = sc.next();
        String result = "";
        for (int i = 0; i < N; i++) {
            result += S.charAt(i);
            result += T.charAt(i);
        }
        System.out.println(result);
    }
}
