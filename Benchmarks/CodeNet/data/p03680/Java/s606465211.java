import java.util.Scanner;

/**
 * Created by dizzyvn on 6/24/17.
 */
public class Main {
    public static void main(String[] args){
        // input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // process
        int count = 0;
        boolean[] flag = new boolean[n+1];

        int pos = 1;

        while (pos != 2 && !flag[pos]) {
            flag[pos] = true;
            pos = a[pos];
            count++;
        }

        // output
        if (pos == 2) {
            System.out.println(count);
        } else {
            System.out.println(-1);
        }
    }
}