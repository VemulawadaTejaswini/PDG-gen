import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] k = new int[6];
        int ans = 0;
        k[0] = 6;
        k[1] = 36;
        k[2] = 150;
        k[3] = 540;
        k[4] = 1806;
        k[5] = 6036;
        int b = 1;
        int keta = 1;
        for (int i = 1; i < 100; i++) {
            if (n >= b) {
                keta = i;
            } else {
                break;
            }
            b = b * 10;
        }
        for (int i = 0; i < keta - 4; i++) {
            ans += k[i];
        }
        int mama = 1;
        for (int i = 0; i < keta; i++) {
            mama = mama * i;
        }
        int d = (int) Math.pow(10, keta - 1);
        int saidai = n / d;
        int niban = n / (d - 1) % 10;
        int huta = n / (d - 1);
        if (keta >= 5) {
            if (huta >= 77) {
                ans += k[keta - 3];
            } else {
                if (saidai >= 7) {
                    if (niban >= 5) {
                        ans += 8 * k[keta - 5];
                    } else if (niban >= 3) {
                        ans += 7 * k[keta - 5];
                    }
                } else if (saidai >= 5) {
                    if (niban >= 7) {
                        ans += 5 * k[keta - 5];

                    } else if (niban >= 5) {
                        ans += 4 * k[keta - 5];
                    } else if (niban >= 4) {
                        ans += 3 * k[keta - 5];
                    }
                } else if (saidai >= 3) {
                    if (niban >= 7) {
                        ans += 2 * k[keta - 5];

                    } else if (niban >= 5) {
                        ans += 1 * k[keta - 5];
                    } else if (niban >= 4) {
                        ans += k[keta - 5];
                    }
                }
            }
            System.out.println(ans);

        }
    }
}