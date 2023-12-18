import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        boolean flg = true;
        for (int i = 0; i < n; i++) {
            if(t[i] < x[i] + y[i]) {
                System.out.println("No");
                return;
            } else if(t[i] > x[i] + y[i]) {
                if(t[i] % 2 != (x[i] + y[i]) % 2) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}