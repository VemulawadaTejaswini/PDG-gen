import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        System.out.println(solve(a,b));
    }

    public static long solve(long a, long b){
        long gcd = gcd(a,b);
        if(gcd==1) return 1;
        if(gcd > 100000){

        }
        int result = 1;
        for(int i=2; i<= Math.sqrt(gcd); i++){
           if(gcd%i==0){
               result++;
               while(gcd % i ==0){
                   gcd /= i;
               }
           }
        }
        return result;
    }

    public static long gcd (long x, long y){
        if(x<y) gcd(y,x);
        if(y == 0) return x;
        return gcd(y, x % y);

    }
}