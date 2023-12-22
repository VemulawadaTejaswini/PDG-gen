import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        int[] dist = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            dist[i] = Math.abs(arr[i] - x);
        }
        Arrays.sort(dist);
        for (int i = 0; i < n; i++) {
            if (dist[i] != (i + 1) / 2) {
                int a = x - (i + 1) / 2, b = x + (i + 1) / 2;
                for (int j = 0; j < n; j++) {
                    if (arr[j] == b) {
                        System.out.println(a);
                        return;
                    } else if (arr[j] == a) {
                        System.out.println(b);
                        return;
                    }
                }
                System.out.println(a);
                return;
            }
        }
    }
}
