import java.util.*;

public class Main 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        long  n;String g;
        n=in.nextInt();
        g=in.next();
        long ans=0;
        int k=g.indexOf('.');
        
        ans=n*(Integer.parseInt(g.substring(0,k)))+(n*(int)(g.charAt(k+1)-'0'))/10+(n*(int)(g.charAt(k+2)-'0'))/100;

        System.out.println(ans);
        
    }   

}
