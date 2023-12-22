import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = a - b;
            long gcd;
            if (c < 0){
                gcd = gcd(b, a);
            } else {
                gcd = gcd(a, b);
            }
            long lcm = a * b / gcd;
         System.out.println(gcd + " " + lcm);
        }
    }

    public static long gcd(long a, long b){
        long c = a % b;
        if (c == 0 ){
            return b;
        } else {
           return gcd(b, c);
        }
    }
}

