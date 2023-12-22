import java.util.Scanner;

public class Main {

    public void DL() {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        int n = s.nextInt();
        int[][] list1 = new int[n][w + 1];
        int[][] list2 = new int[n][w + 1];

        for (int i = 0; i < n; i++) {
            String[] input = s.next().split(",");
            int in0 = Integer.parseInt(input[0]);
            int in1 = Integer.parseInt(input[1]);
            list1[i][in0] = in1;
            list2[i][in1] = in0;
        }

        int[] a = new int[w + 1];

        for (int i = 1; i <= w; i++) {
            int p = i;
            for (int j = 0; j < n; j++) {
                if (list1[j][p] != 0) {
                    p = list1[j][p];
                } else if (list2[j][p] != 0) {
                    p = list2[j][p];
                }
            }
            a[p] = i;
        }

        for (int i = 1; i <= w; i++) {
            System.out.println(a[i]);
        }

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.DL();
    }
}
