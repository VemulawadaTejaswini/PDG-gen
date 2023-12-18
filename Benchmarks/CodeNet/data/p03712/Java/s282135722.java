import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();

        char[][] a = new char[H][W];

        for (int i = 0; i < H; i++) {
            a[i] = sc.next().toCharArray();
        }

        char[][] A = new char[H + 2][W + 2];


        for (int i = 0; i < H + 2; i++) {
            for (int j = 0; j < W + 2; j++) {
                char ch = 0;
                if (i == 0 || i == H + 1 || j == 0 || j == W + 1) {
                    ch = '#';
                } else {
                    ch = a[i - 1][j - 1];
                }
                A[i][j] = ch;
            }
        }

        for (int i = 0; i < H + 2; i++) {
            System.out.println(new String(A[i]));
        }


        return;
    }

}