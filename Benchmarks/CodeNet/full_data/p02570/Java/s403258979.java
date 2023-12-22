import java.util.*; 
import java.io.*; 
import java.lang.Math; 
public class Main
{
     public static void main(String []args)
     {
        Scanner in=new Scanner(System.in);
        int d,t,s;
        d=in.nextInt();
        t=in.nextInt();
        s=in.nextInt();
        if(t*s>=d)
        {
          System.out.println("Yes");
        }
        else
        {
          System.out.println("No");
        }
     }
}

