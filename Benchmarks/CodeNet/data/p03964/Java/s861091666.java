import java.util.Scanner;

public class Main {
    public static long upperbound(long x, long y){
        if(x % y == 0)
            return x / y;
        else
            return x / y + 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a, b;
        a = 1;
        b = 1;
        for(int i = 0; i < n; i++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long j = Math.max(upperbound(a, x), upperbound(b, y));
            a = x * j;
            b = y * j;
        }
        System.out.println(a + b);
    }
}
