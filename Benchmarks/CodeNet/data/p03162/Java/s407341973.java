import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] a = new int[n][3];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                a[i][j] = scanner.nextInt();
            }
        }
        System.out.println(new Main().f(a, n));
    }

    public int f(int[][] happy, int n) {
        int a = happy[0][0], b = happy[0][1], c = happy[0][2];
        for(int i = 1; i < n; i++){
            int ta = Math.max(b, c) + happy[i][0];
            int tb = Math.max(a, c) + happy[i][1];
            int tc = Math.max(a, b) + happy[i][2];
            a = ta;
            b = tb;
            c = tc;
        }
        return Math.max(a, Math.max(b, c));
    }
}
