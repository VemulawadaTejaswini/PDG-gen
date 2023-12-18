import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = Integer.parseInt(sc.next());
        }
        int m = Integer.parseInt(sc.next());
        for (int i = 0; i < m; i++) {
            int p = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            int temp = t[p - 1];
            t[p - 1] = x;
            System.out.println(Arrays.stream(t).sum());
            t[p - 1] = temp;
        }
    }
}