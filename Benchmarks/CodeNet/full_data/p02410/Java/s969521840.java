import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nm = new int[]{sc.nextInt(), sc.nextInt()};
        int[][] a = new int[nm[0]][nm[1]];
        int[] b = new int[nm[1]];
        for (int i = 0; i < nm[0]; i++) {
            for (int j = 0; j < nm[1]; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < nm[1]; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < nm[0]; i++) {
            int sum = 0;
            for (int j = 0; j < nm[1]; j++) {
                sum += a[i][j] * b[j];
            }
            System.out.println(sum);
        }
    }
}