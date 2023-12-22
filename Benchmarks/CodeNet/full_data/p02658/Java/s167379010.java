import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            if (a[i] == 0) {
                System.out.println(0);
                return;
            }
        }
        long ans = a[0];
        long std = 1000000000000000000L;
        for (int i = 1; i < n; i++) {
            ans = ans * a[i];
        }

        if (ans > std) {
            System.out.println("-1");
        } else {
        	System.out.println(ans);
        }

    }
}