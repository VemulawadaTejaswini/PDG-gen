import java.util.Scanner;

//ABC055B
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long ans = 1;
        long x = 1000000007;
        int N = s.nextInt();
        for(int i = 1; i <= N; i++){
            ans *= i;
            ans %= x;
        }
        System.out.println(ans);
    }
}