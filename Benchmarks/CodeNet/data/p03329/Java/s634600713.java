import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = Integer.MAX_VALUE;
        for(int i = 0; i <= n; i++){
            ans = Math.min(ans, calc(i, 6) + calc(n - i, 9));
        }
        System.out.println(ans);
    }
    public static int calc (int n, int p)
    {
        if(n == 0){
            return 0;
        }
        int i = 1;
        int j = 1;
        while(Math.pow((double) p, (double) i) <= n){
            i++;
            j *= p;
        }
        return 1 + calc(n - j, p);
    }
}