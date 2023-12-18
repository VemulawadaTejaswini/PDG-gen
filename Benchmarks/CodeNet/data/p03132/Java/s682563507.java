
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        long[][] memo = new long[n+1][5];

        for(int i=0; i<n; i++) {
            int d0 = a[i];
            int d2 = a[i] == 0 ? 2 : (a[i]%2);
            int d1 = (a[i]+1) % 2;
            memo[i+1][0] = memo[i][0] + d0;
            memo[i+1][1] = Math.min(memo[i][0], memo[i][1]) + d2;
            memo[i+1][2] = Math.min(memo[i][1], memo[i][2]) + d1;
            memo[i+1][3] = Math.min(memo[i][2], memo[i][3]) + d2;
            memo[i+1][4] = Math.min(memo[i][2], memo[i][3]) + d0;
        }
        Arrays.sort(memo[n]);
        System.out.println(memo[n][0]);

    }


}
