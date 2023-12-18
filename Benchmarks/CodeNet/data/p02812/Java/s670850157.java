// 
import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static String file = "../in";

    static int test = 10;  // 0 for local testing, 1 for std input

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");}
        
        /****************************************************/
        /****************************************************/
        /****************************************************/
        /****************************************************/
    
        new Main().b();
    }

    void b() throws Exception
    {
        in.readLine();
        char[] chs = in.readLine().toCharArray();
        int n = chs.length;
        int re = 0;
        for(int i = 0; i < n - 2; i++)
        {
            if(chs[i] == 'A' && chs[i + 1] == 'B' && chs[i + 2] == 'C')
                re++;
        }
        System.out.println(re);
    }

    void a() throws Exception
    {
        String[] sp = in.readLine().split(" ");
        int a = Integer.valueOf(sp[0]);
        int b = Integer.valueOf(sp[1]);
        if(a * 500 >= b) System.out.println("Yes");
        else System.out.println("No");
    }
}