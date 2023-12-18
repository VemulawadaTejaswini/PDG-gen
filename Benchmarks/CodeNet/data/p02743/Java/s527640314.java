import java.util.*;

public class Main{
    final static long mod = 1000000007;
    //
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        if(c >= a + b && (c - a - b) * (c - a - b) > 4 * a * b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
