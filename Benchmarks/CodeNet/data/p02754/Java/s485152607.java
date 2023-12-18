import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        if(n % (a + b) > n) System.out.println(a * n / (a + b) + a);
        else System.out.println(a * n / (a + b) + n % (a + b));
    }
}