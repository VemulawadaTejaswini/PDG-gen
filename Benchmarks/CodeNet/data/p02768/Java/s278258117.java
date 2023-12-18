import java.util.Scanner;

public class Main {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int answer = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(n == 2) {
            System.out.println(0);
        }
        for (int j = 1 ;j < n+1;j++) {
            answer += comb(n,j);
        }
        int ans = answer - (comb(n,a) + comb(n,b));
        if(ans > (int) (Math.pow(10,9) + 7)) {
            System.out.println(ans%(Math.pow(10,9) + 7));
        } else {
            System.out.println(ans);
        }
    }
   
    public static int kake(int m, int n) {
        int fact = (m-n+1);
        for (int i = (m-n+2);i < m+1;i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int comb(int mn, int nn) {
        int combAns = kake(mn,nn) / kake(nn,nn);
        return combAns;
    }
}