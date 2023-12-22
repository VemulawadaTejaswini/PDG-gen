import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[]{sc.nextInt(), sc.nextInt()};
        int[][] m = new int[a[0]][a[1]];
        for (int i = 0; i < a[0]; i++) {
            for (int j = 0; j < a[1]; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        print2DArray(m);
    }

    private static void print2DArray(int[][] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sb.append(array[i][j]);
                if (j != array[i].length - 1) {
                    sb.append(" ");
                }
                sum += array[i][j];
            }
            sb.append(" ").append(sum);
            sb.append("\n");
        }
        int allsum = 0;
        for (int i = 0; i < array[0].length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sb.append(sum);
            if (i != array[0].length - 1) {
                sb.append(" ");
            }
            allsum += sum;
        }
        sb.append(" ").append(allsum);
        System.out.println(sb);
    }
}