import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(gcd(a,b));
        
    }

    static int gcd(int a, int b)
    {
    if (a < b)
        gcd(b, a);
    int r;
    while ((r = a % b) !=0)
    {
        a = b;
        b = r;
    }
    return b;
    }
}
