import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ttt = sc.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
            t[i] = sc.nextInt();
        }
        int min = 100000;
        for (int i = 0; i < n; i++) {
            if (t[i] <= ttt) {
                if (c[i] < min) {
                    min = c[i];
                }
            }
        }
        if (min > 2000) {
            System.out.println("TLE");
        } else {
            System.out.println(min);
        }
    }
}