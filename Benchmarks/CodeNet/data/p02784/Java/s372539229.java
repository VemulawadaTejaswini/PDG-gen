import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC153B - Common Raccoon vs Monster

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int n = sc.nextInt();

        int[] a = new int[n];

        int ttl = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            ttl += a[i];
        }

        System.out.println(ttl < h ? "No" : "Yes");
    }
}