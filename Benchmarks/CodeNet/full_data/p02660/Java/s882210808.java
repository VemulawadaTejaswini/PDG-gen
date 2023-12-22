import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        long n = sc.nextLong();
        long nt = n;
        for(int i = 2; i <= (int)Math.sqrt(n) + 1; i++) {
            if(nt % i == 0) {
                res++;
                nt /= i;
            }
        }
        if(n != 1 && res == 0) res++;
        System.out.println(res);
    }
}
