import java.util.Scanner;

public class Main {
    static long f(long n){
        long ans=1;
        for (long i=n; i>0; i=i-2){
            ans=ans*i;
        }
        return ans;
    }

    static long trailingZeros(long a){
        if (a == 0) {
            return 0;
        }
        int count = 0;
        while (a % 10 == 0) {
            count++;
            a /= 10;
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long num =f(N);
        System.out.println(trailingZeros(num));

    }
}
