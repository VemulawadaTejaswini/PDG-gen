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
        String str=sc.next();
        int c=0;
        for(i=0;i<3;i++)
        {
            ch=str.charAt(i);
            if(str.charAt(0)=='R' && str.charAt(1)=='R' && str.charAt(2)=='R')
            println(3);    
            else if((str.charAt(0)=='R' && str.charAt(1)=='R') || (str.charAt(1)=='R' && str.charAt(2)=='R'))
            println(2);
            else if(str.indexOf('R')>=0)
            println(1);
            else
            println(0);
        }
        sc.close();
    }
}