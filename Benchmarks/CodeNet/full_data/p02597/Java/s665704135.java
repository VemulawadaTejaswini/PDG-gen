import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        char[] c = scanner.next().toCharArray();

        int cnt = 0;
        int j = N - 1;

        for (int i = 0; i < N; i++) {
            if (c[i] == 'W') {
                for (; j > i; j--) {
                    if (c[j] == 'R') {
                        swap(c, i, j);
                        cnt++;
                        break;
                    }
                }
            }
        }

        System.out.println(cnt);
    }

    public static void swap(char[] c, int idxA, int idxB) {
        char tmp = c[idxA];

        c[idxA] = c[idxB];
        c[idxB] = tmp;
    }
}
