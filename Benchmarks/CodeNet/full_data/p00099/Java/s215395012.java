import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] list = new int[n + 1];
        int id = -1;
        int top = Integer.MIN_VALUE;
        for (int i = 0; i < q; i++) {
            int a = sc.nextInt();
            int v = sc.nextInt();

            list[a] += v;
            if (id == a) {
                top += v;
            }
            if (v < 0 && id == a) {
                for (int j = 1; j < n + 1; j++) {
                    if (list[j] > top || list[j] == top && j < id) {
                        top = list[j];
                        id = j;
                    }
                }
            }
            if (v > 0 && id != a && (list[a] > top || list[a] == top && a < id)) {
                top = list[a];
                id = a;
            }
            System.out.println(id + " " + top);
        }
    }

}
