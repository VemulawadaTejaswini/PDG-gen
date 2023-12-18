import java.util.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long x = a*b/2;
        if(a==1 || b==1)x=0;
        else if(a%2==1 || b%2==1) x++;
        System.out.println(x);
    }
 
}