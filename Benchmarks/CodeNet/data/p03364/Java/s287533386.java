import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        char data[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.next().toCharArray();
        }

        int cnt = 0;
        for (int b = 0; b < n; b++) {
            if (check(data, 0, b, n)) {
                cnt += n;
            }
        }

        System.out.println(cnt);
    }

    private boolean check(char data[][], int a, int b, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (data[(i + a) % n][(j + b) % n] != data[(j + b) % n][(i + a) % n]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
