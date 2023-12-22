import java.util.Scanner;
import java.time.Year;
import java.util.Random;
import java.math.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n = sc.nextInt();
        long d = sc.nextInt();
        long x = 0;
        long y = 0;
        long d2=d*d;
        long a = 0;
        int bigger = 0;
        int smaller = 0;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            a=(Math.abs(x)*Math.abs(x) + Math.abs(y)*Math.abs(y)); 
            if(a > d2){
                bigger++;
            }else{
                smaller++;
            }
            if(bigger+smaller >= n){
                System.out.println(smaller);
                break;
            }
        }
    }
}
     