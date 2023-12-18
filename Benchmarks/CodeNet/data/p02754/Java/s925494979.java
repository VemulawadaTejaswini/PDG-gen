import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        long n = scan.nextInt();
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = n / (a + b);
        long d = n % (a + b);
        if(d <= a){
            System.out.println(a * c + d);
        }else{
            System.out.println(a * (c + 1));
        }
    }
}