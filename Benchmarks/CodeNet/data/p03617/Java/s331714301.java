import java.util.Scanner;

/**
 *
 * @author mustafa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        long q = sc.nextLong();
        long h = sc.nextLong();
        long s = sc.nextLong();
        long d = sc.nextLong();
        long n = sc.nextLong();
        
        if (4 * q < s)
            s = 4 * q;
        else
            if (2 * h < s)
                s = 2 * h;
        
        if (n == 1)
        {
            System.out.println(s);
            return;
        }
        
        if (s * 2 < d)
        {
            System.out.println(n*s);
            return;
        }
        
        else
        {
            long k = n % 2;
            
            if (k == 0)
            {
                System.out.println((long)((n / 2) * d));
                return;
            }
            else
            {
                System.out.println((long)s + ((n - 1)/2) * d);
                return;
            }
        }
    }
    
}
