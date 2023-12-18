import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long res = N+1-2;
        for(long i = 1; i*i <= N; i++) {
            if(N%i==0) {
                res = Math.min(res, i+(N/i)-2);
            }
        }
        System.out.println(res);
    }
}
