import java.util.Scanner;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long temp = 0;
        long result = 0;
        result = (n / (a+b)) * a;
        temp = n % (a+b);
        result =result+ Math.min(temp, a);
        System.out.println(result);
    }
}