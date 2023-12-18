import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int R = sc.nextInt();
        int ans = Math.min(P + Q, Q + R);
        ans = Math.min(ans, R + P);
        System.out.print(ans);
    }
}