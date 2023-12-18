import java.util.Scanner;

public class Main {

    static long gcd (long a, long b) {return b>0?gcd(b,a%b):a;}
    static long lcm (long a, long b) {return a*b/gcd(a,b);}

    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong()-1;
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();
        
        long cc = (B/C)-(A/C);
        long dc = (B/D)-(A/D);
        long lcm = lcm(C, D);
        
        long ccd = (B/lcm)-(A/lcm);
        System.out.println(B-A-cc-dc+ccd);
    }
}