import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s[] = new String[n];
        long M = 0;
        long A = 0;
        long R = 0;
        long C = 0;
        long H = 0;
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            char c = s[i].charAt(0);
            if (c == 'M') {
                M++;
            } else if (c == 'A') {
                A++;
            } else if (c == 'R') {
                R++;
            } else if (c == 'C') {
                C++;
            } else if (c == 'H') {
                H++;
            }
        }
        long ans = 0;
        long MA = M * A;
        ans += MA * R;
        ans += MA * C;
        ans += MA * H;
        long MR = M * R;
        ans += MR * C;
        ans += MR * H;
        ans += M * C * H;
        long AR = A * R;
        ans += AR * C;
        ans += AR * H;
        ans += A * C * H;
        ans += R * C * H;
        System.out.println(ans);

    }
}