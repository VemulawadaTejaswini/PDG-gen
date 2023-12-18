
import java.util.*;
import java.lang.*;

public class R
{  
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt(); int ans = 0;
        if(n>500) {
            ans = (n/500)*1000;
            n = n%500;
        }
        if(n > 5) {
            ans += (n/5)*5;
        }
        System.out.println(ans);
    }
}