import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S[] = new String[N];
        for (int i = 0; i < N; i++) {
            S[i] = scan.next();
        }

        int count = 1;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (S[i].equals(S[j])) {
                    break;
                }
                if (j == N - 1) {
                    count++;
                }
            }
        }
        System.out.println(count);
        scan.close();
    }
}