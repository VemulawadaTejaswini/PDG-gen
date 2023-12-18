import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] s = new char[N][10];
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            s[i] = sc.next().toCharArray();
            Arrays.sort(s[i]);
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (Arrays.equals(s[i], s[j])) cnt++;
            }
        }

        System.out.println(cnt);
    }
}