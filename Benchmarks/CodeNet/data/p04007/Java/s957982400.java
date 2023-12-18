import java.util.*;

class Main {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                int H = sc.nextInt(), W = sc.nextInt();
                String[] a = new String[H];
                for (int i = 0; i < H; i++) {
                        a[i] = sc.next();
                }
                for (int i = 0; i < H; i++) {
                        for (int j = 0; j < W; j++) {
                                if (j != W - 1 && (i % 2 == 0 || j == 0 || a[i].charAt(j) == '#')) {
                                        System.out.print('#');
                                } else {
                                        System.out.print('.');
                                }
                        }
                        System.out.println("");
                }
                System.out.println("");

                for (int i = 0; i < H; i++) {
                        for (int j = 0; j < W; j++) {
                                if (j != 0 && (i % 2 == 1 || j == W - 1 || a[i].charAt(j) == '#')) {
                                        System.out.print('#');
                                } else {
                                        System.out.print('.');
                                }
                        }
                        System.out.println("");
                }
        }
}