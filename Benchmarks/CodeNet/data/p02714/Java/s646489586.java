import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        double cnt=0;
        for (int i = 0; i < S.length() - 2; ++i) {
            for (int j = i + 1; j < S.length() - 1; ++j) {
                for (int k = j + 1; k < S.length(); ++k) {
                    if (S.charAt(i) != S.charAt(j) && S.charAt(i) != S.charAt(k) && S.charAt(j) != S.charAt(k))
                        if (k - j != j - i) {
                            cnt++;
                        }
                }
            }
        }
        System.out.println(cnt);
    }
}
