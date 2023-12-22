
import java.util.*;

class GCD
{
    int gcd; int temp;
    public int HCF(int a, int b)
    {
        if(a!=0&&b!=0)
        {
            if(a>b)return HCF(b, a%b);
            else return HCF(a, b%a);   
        }
        else 
        {
            if(a>0) return a;
            else return b;
        }
    }
}
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        GCD g = new GCD();
        System.out.println(g.HCF(f, s));
    }
}   



