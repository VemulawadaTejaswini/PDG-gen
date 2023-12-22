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
        int mod=sc.nextInt();
        int val=7%mod;
            int i;
            for(i=1;i<=mod;i++)
            {
                if(val==0)
                {
                    println(i);
                    return ;
                }
                val=((val*10)+7)%mod;
            }
            println(-1);
            
        
        sc.close();
    }
}