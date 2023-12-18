import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();

        int Rcnt = (int) S.chars().filter(ch -> ch == 'R').count();
        int Gcnt = (int) S.chars().filter(ch -> ch == 'G').count();
        int Bcnt = (int) S.chars().filter(ch -> ch == 'B').count();

        int num = Rcnt * Gcnt * Bcnt;

        for (int i = 0; i < N; i++) {
            for (int d = 0; d < N; d++) {
                int j = i + d;
                int k = j + d;
                if (k >= N) {
                    break;
                }
                if (S.charAt(i) != S.charAt(j) && S.charAt(i) != S.charAt(k) && S.charAt(j) != S.charAt(k)) {
                    num -= 1;
                }
            }
        }
        System.out.println(num);
    }
}