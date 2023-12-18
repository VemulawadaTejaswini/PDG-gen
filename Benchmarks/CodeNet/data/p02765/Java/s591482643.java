import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a < 10) System.out.println(b + 100 * (10 - 2));
        else System.out.println(b);
    }
}