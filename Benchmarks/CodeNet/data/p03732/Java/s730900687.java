import java.util.*;
public class Main
{   
    public static void main(String[] args)
    {
    	
        Scanner s=new Scanner(System.in);
        
        long ans=0,x,y,w,last=0;
        int n,q;
        n=s.nextInt();
        w=s.nextLong();
        
        Vector<Long>U=new Vector<Long>();
        Vector<Long>V=new Vector<Long>();
        
        for(int i=1;i<=n;i++)
        {
        	q=0;
        	x=s.nextLong();
        	y=s.nextLong();
            if(x>w)
            continue;
            
            for(int j=0;j<last;j++)
            {
            	if((U.elementAt(j)+x)<=w)
            	{
            		U.add(U.elementAt(j)+x);
            		V.add(V.elementAt(j)+y);
            		q++;
            	}
            }
            U.add(x);
    		V.add(y);
    		q++;
    		last+=q;
        }
        
        
        
        for(int i=0;i<last;i++)
        {
        	if((V.elementAt(i)>ans) && ((U.elementAt(i))<=w))
                ans=V.elementAt(i);
        }
        System.out.println(ans);
        s.close();
    }
}