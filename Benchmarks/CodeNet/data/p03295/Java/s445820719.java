import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] data = new int[M][2];
        for (int i = 0; i < M; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }

        sort(data, 1);
        int result = 0;
        int nowclear = 0;

        int nowfrom = 0;
        int nowto = 0;
        for (int i = 0; i < M; i++) {
            nowfrom = data[i][0];
            nowto = data[i][1];

            if (nowclear < nowfrom) {
                nowclear = nowto - 1;
                result++;
            }
        }
        System.out.println(result);

    }

    private static void sort(int[][] ob, int column) {
        Arrays.sort(ob, new Comparator<Object>() {
            public int compare(Object o1, Object o2) {
                int[] one = (int[]) o1;
                int[] two = (int[]) o2;
                if (one[column] > two[column]) {
                    return 1;
                } else if (one[column] < two[column]) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }
}
