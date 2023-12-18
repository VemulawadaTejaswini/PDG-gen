import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(),
            c = sc.nextInt(), d = sc.nextInt();

        c = Math.abs(a - c);
        d = Math.abs(b - d);
        int ans = c + d;
        System.out.println(ans - gcd(c, d));
    }
    static int gcd(int x, int y){
        if(y == 0)return x;
        return gcd(y, x % y); 
    }
}