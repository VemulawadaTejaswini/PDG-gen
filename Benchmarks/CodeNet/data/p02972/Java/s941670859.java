import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            b[i] = 0;
        }

        for (int i = n; i > 0; i--) {
            int count = 0;
            for (int j = 2 * i; j <= n; j += j) {
                if(b[j-1] == 1){
                    count++;
                }
            }
            if ((a[i-1] == 0 && count % 2 == 1) || (a[i-1] == 1 && count % 2 == 0)) {
                b[i-1] = 1;
            }
        }

        System.out.println(b.length);
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}

