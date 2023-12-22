/*input
5 5 2 3



*/
import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
 {
 static Scanner in = new Scanner(System.in);
 
 
 
 
    public static void solve()
    {   
        int n=in.nextInt();
        int ac=0,wa=0,tle=0,re=0;
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String s=in.nextLine();
            if(s.equals("AC"))ac++;
            else if(s.equals("WA"))wa++;
            else if(s.equals("TLE"))tle++;
            else re++;
            
        }
        
        System.out.println("AC x "+ac);
        System.out.println("WA x "+wa);
        System.out.println("TLE x "+tle);
        System.out.println("RE x "+re);
    	
    	
    }
    
	public static void main (String[] args)
	 {
	 int t=1;
	 while(t-->0)
	 {
	  solve();
	 }
}
}