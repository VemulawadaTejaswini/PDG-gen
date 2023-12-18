import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long x = factorial(n) / ((factorial(2) * factorial(n - 2)));
        long y = factorial(m) / ((factorial(2) * factorial(m - 2)));

        System.out.println(x + y);

    }

    static long factorial(long n){
        if(n <= 0){
            return 1;
        }
        return n * factorial(n-1);
    }

}
