import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] num = new int[n];
        boolean cant = false;
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int c = sc.nextInt();
            if (s == 1 && c == 0 || num[s - 1] != 0 && num[s - 1] != c) {
                cant = true;
            } else {
                num[s - 1] = c;
            }
        }
        if (cant) {
            System.out.println(-1);
        } else {
            System.out.println(num[0] * 100 + num[1] * 10 + num[2]);
        }
    }
}
