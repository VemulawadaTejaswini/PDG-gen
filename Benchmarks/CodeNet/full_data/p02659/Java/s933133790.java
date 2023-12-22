import java.util.*;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        
        long c = (long)(b * 100.0);
        long ans = a * c /100;
        System.out.println(ans);
    }
}