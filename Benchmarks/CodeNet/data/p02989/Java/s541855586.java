import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] d = new int[n];
        for(int i = 0; i < n; i++) {
            d[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(d);
        System.out.println(d[n / 2] - d[n / 2 - 1]);
    }
}