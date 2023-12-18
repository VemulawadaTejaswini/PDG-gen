import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        long t = (long)Math.sqrt(n);

        long a = 1;

        for (long i=t; 1<=i; i--){
            if (n%i==0){
                a = n/i;
                break;
            }
        }

        System.out.print((n/a) + a -2);
    }
}