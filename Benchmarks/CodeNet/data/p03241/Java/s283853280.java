import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = 0;

        for(int i = m; i > 0; i--){
            if( m % i == 0 && m / i >= n){
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}