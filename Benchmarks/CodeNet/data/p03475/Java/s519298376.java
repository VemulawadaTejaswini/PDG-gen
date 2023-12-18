import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] a = new int[n - 1][3];
        for (int i = 0; i < n - 1; i++) {
            int c = Integer.parseInt(sc.next());
            int s = Integer.parseInt(sc.next());
            int f = Integer.parseInt(sc.next());
            a[i][0] = c;
            a[i][1] = s;
            a[i][2] = f;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = i; j < n - 1; j++) {
                if (temp > a[j][1]) {
                    if (temp % a[j][2] != 0) {
                        temp += a[j][2] - temp % a[j][2] + a[j][0];
                    } else {
                        temp += a[j][0];
                    }
                } else {
                    temp = a[j][0] + a[j][1];
                }
            }
            sb.append(temp + "\n");
        }
        System.out.println(sb.toString());
    }
}