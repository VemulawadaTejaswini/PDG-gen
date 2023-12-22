import java.util.*;
public class Main
{
	public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
        long c=sc.nextLong();
        long d=sc.nextLong();
        
        long ans=1;
        
        if(a<=0 && b<=0){
            if(c<=0)
                ans=a*c;
            else if(c>=0)
                ans=b*c;
        }
        
        else if(a<=0 && b>=0){
            if(d<=0)
                ans=a*c;
            else if(d>=0)
                ans=b*d;
        }
        
        else if(a>=0 && b>=0){
            if(d<=0)
                ans=a*d;
            else if(d>=0)
                ans=b*d;
        }
       
        System.out.println(ans);
    }
}
