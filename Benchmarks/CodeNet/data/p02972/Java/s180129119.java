import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = n; i > 0; i--) {
            int j = 2 * i;
            int count = 0;
            while (j <= n) {
                if (b.contains(j)) {
                    count++;
                }
                j += j;
            }
            if ((a[i-1] == 0 && count % 2 == 1) || (a[i-1] == 1 && count % 2 == 0)) {
                b.add(i);
            }
        }

        System.out.println(b.size());
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}

