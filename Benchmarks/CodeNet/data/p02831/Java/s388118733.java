import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        System.out.println(lcm(a, b));
        scan.close();
    }
    
    public static int lcm(int a, int b){
        return a * b / gcd(a, b);
    }
    
    public static int gcd(int a, int b){
        if(a % b == 0) return b;
        return gcd(b, a % b);
    }
}