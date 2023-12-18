import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int d = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;

        if( n < 100 ){
           ans = (int)Math.pow(100.0 , (double)d) * n;
        }

        else{
            ans = (int)Math.pow(100.0 , (double) d) * 11 / 10;
        }

        System.out.println(ans);
        
    }
}