import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] l = new int[n];
        for (int i = 0;i<n;i++) {
            l[i] = scanner.nextInt();
        }

        int d = 0;
        int p = 0;
        while (d <= x && p<n) {
            d += l[p++];
        }
        System.out.println(p);
    }
}