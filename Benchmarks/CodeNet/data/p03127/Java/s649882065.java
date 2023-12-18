import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int ans = a[0];
        for(int i = 1; i < n; i++){
            ans = gcd(ans, a[i]);
        }
        System.out.println(ans);
    }
    static int gcd (int a, int b){
        if(a == 0) return b;
        if(a > b) return gcd(b, a);
        return gcd(a, b % a);
    }
}
 