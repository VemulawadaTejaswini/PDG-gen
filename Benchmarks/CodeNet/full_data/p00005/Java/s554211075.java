import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = gcd(a, b);
            int lcm = a / gcd * b / gcd * gcd;
            System.out.println(gcd + " " + lcm);
        }
        
    }
    public static int gcd(int a, int b){
       if(a % b == 0){
           return b;
       }else{
           return gcd(b, a % b);
       }
    }
}
