import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) {
      Main o=new Main();
      o.main();
      o.flush();
      o.close();
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        long k=sc.nextLong();
        long d=sc.nextLong();
        long rem=x%d;
        long quo=x/d;
        if(k<quo)
        {
            if(x>0)
            {
            while(k-->0)
            {
                x-=d;
            }
            }
            else
            {
                while(k-->0)
                {
                    x+=d;        
                }
                
            }
            println(Math.abs(x));
        }
        else
        {
            if(x>0)
            {
                long v1=rem-d;
                long rem1=k-quo;
                if(rem1%2==0)
                println(Math.abs(rem));
                else
                println(Math.abs(v1));
            }
            else
            {
                long v2=rem+d;
                quo*=-1;
                long rem2=k-quo;
                if(rem2%2==0)
                println(Math.abs(rem));
                else
                println(Math.abs(v2));
            }
        }
        sc.close();
    }
}