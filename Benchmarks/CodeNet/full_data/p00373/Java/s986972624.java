import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w1 = sc.nextInt(), h1 = sc.nextInt(), w2 = sc.nextInt(), h2 = sc.nextInt(), c = 0;
        int hash_a[][][] = new int[800][800][10], hash_b[][] = new int[800][10];
        int cumo_a[][][] = new int[800][800][10], cumo_b[][] = new int[800][10];
        int s[][] = new int[800][700], t[][] = new int[800][800];

        for (int i = 0; i < h1; i++) {
            char[] ss = sc.next().toCharArray();
            for (int j = 0; j < w1; j++) {
                if ('0' <= ss[j] && ss[j] <= '9')
                    s[i][j] = ss[j] - '0';
                if ('a' <= ss[j] && ss[j] <= 'z')
                    s[i][j] = ss[j] - 'a' + 11;
                if ('A' <= ss[j] && ss[j] <= 'Z')
                    s[i][j] = ss[j] - 'A' + 37;
                if (ss[j] == '?')
                    s[i][j] = 63;
            }
        }
        for (int i = 0; i < h2; i++) {
            char[] ss = sc.next().toCharArray();
            for (int j = 0; j < w2; j++) {
                if ('0' <= ss[j] && ss[j] <= '9')
                    t[i][j] = ss[j] - '0';
                if ('a' <= ss[j] && ss[j] <= 'z')
                    t[i][j] = ss[j] - 'a' + 11;
                if ('A' <= ss[j] && ss[j] <= 'Z')
                    t[i][j] = ss[j] - 'A' + 37;
                if (ss[j] == '?')
                    t[i][j] = 63;
            }
        }
        for (int i = 0; i < h1; i++) {
            for (int j = 0; j < w1 - w2 + 1; j++) {
                for (int k = 0; k < w2; k++) {
                    for (int l = 0; l < 6; l++) {
                        hash_a[i][j][k * 6 / 60] = hash_a[i][j][k * 6 / 60] * 2 + (s[i][j + k] >> l & 1) == 1 ? 1 : 0;
                        cumo_a[i][j][k * 6 / 60] = cumo_a[i][j][k * 6 / 60] * 2 + (s[i][j + k] == 63 ? 1 : 0);
                    }
                }
            }
        }
        for (int i = 0; i < h2; i++) {
            for (int j = 0; j < w2; j++) {
                for (int k = 0; k < 6; k++) {
                    hash_b[i][j * 6 / 60] = hash_b[i][j * 6 / 60] * 2 + (t[i][j] >> k & 1) == 1 ? 1 : 0;
                    cumo_b[i][j * 6 / 60] = cumo_b[i][j * 6 / 60] * 2 + (t[i][j] == 63 ? 1 : 0);
                }
            }
        }

        for (int i = 0; i < h1 - h2 + 1; i++) {
            out: for (int j = 0; j < w1 - w2 + 1; j++) {
                for (int k = 0; k < h2; k++) {
                    int p1[] = new int[10], p2[] = new int[10];
                    for (int l = 0; l < 10; l++) {
                        p1[l] = hash_a[i + k][j][l] ^ hash_b[k][l];
                        p2[l] = cumo_a[i + k][j][i] | cumo_b[k][l];
                        if ((p1[l] | p2[l]) != p2[l]) {
                            break out;
                        }
                    }
                    if (k == h2 - 1)
                        c++;
                }
            }
        }
        System.out.println(c);
    }
}

