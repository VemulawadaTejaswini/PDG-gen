import java.util.Scanner;

public class Main{

    static int[][] dp = new int[201][201];
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int k = stdIn.nextInt();

        long sum = 0;
        for(int a=1; a<=k; a++){
            for(int b=1; b<=k; b++){
                for(int c=1; c<=k; c++){
                    sum += tripleGcd(a, b, c);
                }
            }
        }

        System.out.println(sum);
    }

    static int tripleGcd(int a, int b, int c){
        int ab = gcd(a, b);
        return gcd(ab, c);
    }

    static int gcd(int a, int b){
        int ans;
        if(b>a){
            ans = gcd(b, a);
        }else if(b == 0){
            ans = a;
        }else{
            ans = gcd(b, a%b);
        }
        dp[a][b] = ans;
        return ans;
    }
}