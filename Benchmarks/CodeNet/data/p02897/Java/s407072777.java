import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double n=s.nextDouble();
        double ans=0;
        if(n==1)
            ans=1;
        if(n%2==0)
            ans=(n/2)/n;
        if(n%2==1)
        ans=((n+1)/2)/n;
        System.out.println(ans);
    }
}