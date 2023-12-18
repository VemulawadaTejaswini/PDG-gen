import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] H = new int[N];
        for (int i = 0; i < H.length; i++) {
            H[i] = sc.nextInt();
        }
        boolean[] isGood = new boolean[N];
        for (int i = 0; i < isGood.length; i++) {
            isGood[i] = true;
        }
        int[][] dic = new int[N][N];
        for (int i = 0; i < M; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (dic[Math.min(A - 1, B - 1)][Math.max(A - 1, B - 1)] != 0) {
                isGood[A - 1] = false;
                isGood[B - 1] = false;
            }
            if (H[A - 1] > H[B - 1]) {
                isGood[B - 1] = false;
            } else if (H[A - 1] < H[B - 1]) {
                isGood[A - 1] = false;
            } else {
                isGood[A - 1] = false;
                isGood[B - 1] = false;
            }
            dic[Math.min(A - 1, B - 1)][Math.max(A - 1, B - 1)]++;
        }
        int counter = 0;
        for (int i = 0; i < isGood.length; i++) {
            if (isGood[i]) {
                counter++;
            }
        }
        System.out.println(counter);
        sc.close();
    }
}