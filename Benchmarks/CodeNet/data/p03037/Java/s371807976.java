import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());
        int[][] gate = new int[M][2];
        for (int i = 0; i < M; i++) {
            gate[i][0] = Integer.parseInt(scanner.next());
            gate[i][1] = Integer.parseInt(scanner.next());
        }
        scanner.close();


        // 最小レンジを求める
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < M; i++) {
            if (min < gate[i][0]) min = gate[i][0];
            if (max > gate[i][1]) max = gate[i][1];

            if (min > max) {
                System.out.println(0);
                return;
            }
        }
        System.out.println(max - min + 1);
    }
}
