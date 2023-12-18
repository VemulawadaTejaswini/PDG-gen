import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        char[][] a = new char[h][w];
        int[] alpha = new int[26];
        for (int i = 0; i < h; i++) {
            a[i] = sc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                alpha[a[i][j] - 'a']++;
            }
        }
        int g1 = 1;
        int g2 = h / 2 + w / 2;
        int g4 = (h / 2) * (w / 2);
        if (h % 2 == 0 && w % 2 == 0) {
            g1 = 0;
            g2 = 0;
        }
        for (int i = 0; i < alpha.length; i++) {
            if (g1 == 0) {
                break;
            }
            if (alpha[i] % 4 == 1 || alpha[i] % 4 == 3) {
                alpha[i]--;
                g1--;
                i = -1;
            }
        }
        for (int i = 0; i < alpha.length; i++) {
            if (g2 == 0) {
                break;
            }
            if (alpha[i] % 4 == 2) {
                alpha[i] -= 2;
                g2--;
                i = -1;
            }
        }
        for (int i = 0; i < alpha.length; i++) {
            if (g4 == 0) {
                break;
            }
            if (alpha[i] > 0 && alpha[i] % 4 == 0) {
                alpha[i] -= 4;
                g4--;
                i = -1;
            }
        }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] != 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
