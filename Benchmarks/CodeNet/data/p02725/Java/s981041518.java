import java.util.Arrays;
import java.util.Scanner;

/*
問題文


*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
            if (k/2 < a[i]) {
                a[i] = a[i] - k;
            }
        }

      Arrays.sort(a);

      System.out.println(Math.abs(a[0]) + Math.abs(a[n-1]));
    }
}