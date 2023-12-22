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
        int n=sc.nextInt();
        String str=sc.next();
        StringBuffer sb=new StringBuffer(str);
        int i;
        int c=0;
        char ch1,ch2;
        for(i=0;i<n-1;i++)
        {
            ch1=sb.charAt(i);
            ch2=sb.charAt(i+1);
            if(ch1=='W' && ch2=='R')
            {
                c++;
                sb.replace(i,i+1,"RR");
                i=-1;
            }
        }
        println(c);
        
    }
}