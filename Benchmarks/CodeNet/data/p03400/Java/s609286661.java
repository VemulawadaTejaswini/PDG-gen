import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int count = 0;

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            int eat = (d - 1) / a[i];
            count+= eat + 1;
        }
        System.out.println(count + x);
    }
}
