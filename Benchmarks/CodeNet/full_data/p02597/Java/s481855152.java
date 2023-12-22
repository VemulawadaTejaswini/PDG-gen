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
            int c=0;
            int f,s;
            while(sb.lastIndexOf("R")>sb.indexOf("W"))
            {
                
                f=sb.lastIndexOf("R");
                s=sb.indexOf("W");
                if(f==-1 || s==-1)
                break;
                sb.replace(f,f+1,"W");
                sb.replace(s,s+1,"R");
                c++;
            }
            println(c);
            sc.close();
    }
}