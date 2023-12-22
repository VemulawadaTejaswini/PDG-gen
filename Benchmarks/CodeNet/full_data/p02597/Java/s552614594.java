import java.util.*;
import java.io.*;
public class Main extends PrintWriter {
    Main()
    {
        super(System.out);
    }
    public static void main(String args[]) throws Exception {
      Main o=new Main();
      o.main();
      o.flush();
      o.close();
    }
    void main() throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
            String str=br.readLine();
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
            br.close();
    }
}