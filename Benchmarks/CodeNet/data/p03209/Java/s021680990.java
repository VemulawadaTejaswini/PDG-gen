import java.util.*;
class Main
{
    static String[] s = new String[50];
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long[] p = new long[51], b = new long[51];
        p[0] = 1;
        b[0] = 1;
        for(int i = 1; i <= 50; i++){
            p[i] = p[i-1] * 2 + 3;
            b[i] = b[i-1] * 2 + 1;
        }
        long ans = 0;
        if(x > p[n]){
            System.out.println(b[n]);
            return;
        }
        for(int i = n; i >= 0; i--){
            if(p[i] == x){
                ans += b[i];
                break;
            }
            else if(p[i] < x){
                ans += b[i] + 1;
                x -= p[i] + 1;
            }
            x--;
        }
        System.out.println(ans);
    }
}