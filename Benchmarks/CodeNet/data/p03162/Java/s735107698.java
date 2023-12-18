import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        trip [] arr = new trip[n];

        for (int i = 0; i < n; i++) {
            arr [i] = new trip(sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        int [][] dp = new int [n][3];

        dp[0][0] = arr[0].a;
        dp[0][1] = arr[0].b;
        dp[0][2] = arr[0].c;

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][2]) + arr[i].a;
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][2]) + arr[i].b;
            dp[i][2] = Math.max(dp[i-1][0],dp[i-1][1]) + arr[i].c;
        }
        System.out.print(Math.max(Math.max(dp[n-1][0],dp[n-1][1]),dp[n-1][2]));
    }
}

class trip {

    int a;
    int b;
    int c;

    public trip(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
