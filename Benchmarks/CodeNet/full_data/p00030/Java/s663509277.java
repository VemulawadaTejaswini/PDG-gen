import java.util.Scanner;

public class Main {

    public static int s;
    public static int ans = 0;

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        while(true){
            int n = scn.nextInt();
            s = scn.nextInt();
            if(n == 0 && s == 0) break;
            solve(0,n,0);
            System.out.println(ans);
            ans = 0;
        }
    }

    static void solve(int num, int n, int sum){
        if(n == 0 && sum == s){
            ans++;
            return;
        }
        if(num == 10) return;
        solve(num + 1, n - 1, sum + num);
        solve(num + 1, n ,sum);
        return;

    }
}
