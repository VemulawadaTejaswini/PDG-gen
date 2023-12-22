import java.util.*;
public class Main
{
  public static void main(String[] args)
  {
    	Scanner s=new Scanner(System.in);
    	String st=s.next();
    	long sum=0;
        for(int i=0;i<st.length();i++)
        {
          	sum+=Integer.parseInt(""+st.charAt(i));
        }
       if(sum%9==0)
         System.out.println("YES");
    	else
          System.out.println("NO");
  }
}