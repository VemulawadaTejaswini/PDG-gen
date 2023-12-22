import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        for (int i = 1; i <= l[0]; i++) {
            for (int j = 0; j < n && l[j] % i == 0; j++) {
                if (j == n - 1) {
                    System.out.println(i);
                }
            }
        }
    }
}
