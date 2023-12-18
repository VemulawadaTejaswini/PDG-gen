import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        int x = 0;
        while(n > 0) {
            x += n % 10;
            n /= 10;
        }
        if(n % x == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
