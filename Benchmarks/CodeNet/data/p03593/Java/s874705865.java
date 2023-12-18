import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int H = Integer.parseInt(scanner.next());
        int W = Integer.parseInt(scanner.next());

        int[] alf = new int[26];

        String[][] strings = new String[H][W];

        for (int i = 0; i < H; i++) {
            String tmp = scanner.next();
            for (int j = 0; j < W; j++) {
                byte[] asciiCodes = tmp.substring(j, j+1).getBytes();
                alf[(int)asciiCodes[0] - 97] += 1;
            }
        }

        for (int i = 25; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (alf[k] < alf[k + 1]) {
                    int box = alf[k];
                    alf[k] = alf[k + 1];
                    alf[k + 1] = box;
                }
            }
        }

        ArrayList<Integer> alf2 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            if (alf[i] == 0) break;
            alf2.add(alf[i]);
        }

        if (H % 2 == 0 && W % 2 == 0) {
            int a = H * W / 4;
            for (int i = 0; i < a; i++) {
                int b = alf2.get(0) - 4;
                if (b < 0) {
                    System.out.println("No");
                    return;
                }
                alf2.set(0, b);
                alf2.sort(Comparator.reverseOrder());
            }
            System.out.println("Yes");
        } else if (H % 2 == 1 && W % 2 == 1) {
            int halfH = (H - 1) / 2;
            int halfW = (W - 1) / 2;
            for (int i = 0; i < halfH * halfW; i++) {
                int b = alf2.get(0) - 4;
                if (b < 0) {
                    System.out.println("No");
                    return;
                }
                alf2.set(0, b);
                alf2.sort(Comparator.reverseOrder());
            }
            for (int i = 0; i < halfH + halfW; i++) {
                int b = alf2.get(0) - 2;
                if (b < 0) {
                    System.out.println("No");
                    return;
                }
                alf2.set(0, b);
                alf2.sort(Comparator.reverseOrder());
            }
            System.out.println("Yes");
        } else {
            int e;
            int o;

            if (H % 2 == 0) {
                e = H / 2;
                o = (W - 1) / 2;
            } else {
                e = W / 2;
                o = (H - 1) / 2;
            }

            for (int i = 0; i < e * o; i++) {
                int b = alf2.get(0) - 4;
                if (b < 0) {
                    System.out.println("No");
                    return;
                }
                alf2.set(0, b);
                alf2.sort(Comparator.reverseOrder());
            }
            for (int i = 0; i < o; i++) {
                int b = alf2.get(0) - 2;
                if (b < 0) {
                    System.out.println("No");
                    return;
                }
                alf2.set(0, b);
                alf2.sort(Comparator.reverseOrder());
            }
            System.out.println("Yes");
        }
    }
}
