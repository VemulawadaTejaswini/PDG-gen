import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        int s;
        while(true) {
            n = scan.nextInt();
            s = scan.nextInt();
            if(s == 0 && n == 0) break;
            System.out.println(solve(n, s, 9));
        }
        scan.close();
    }

    public static int solve (int n, int s, int r) {
        if(n == 0 && s == 0) return 1;
        if(n == 0 || s < 0 || r == -1) return 0;
        return solve(n, s, r-1) + solve(n-1, s-r, r-1);
    }
}
