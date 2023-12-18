import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt(), b = sc.nextInt(), c =sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        long ans = x*a + y*b;
        
        ans = Math.min(ans ,Math.max(x,y)*2*c);
        if(2*y - x>=1)
        ans = Math.min(ans, x*2*c + (2*y - x)*c);
        if(2*x - y >=1)
        ans = Math.min(ans, y*2*c + (2*x - y)*c);
            
            
            
        System.out.println(ans);
    }
}
