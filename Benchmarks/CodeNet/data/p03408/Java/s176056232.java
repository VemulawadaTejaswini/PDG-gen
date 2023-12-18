//package Contest091;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        HashMap<String,Integer> map = new HashMap<>();
            int blue = sc.nextInt();
            for(int i=1;i<=blue;i++)
            {
                String str = sc.next();
                if(map.containsKey(str))
                {
                    int value = map.get(str);
                    map.remove(str);
                    map.put(str,value+1);
                }
                else
                    map.put(str,1);
            }
            int red = sc.nextInt();
            for(int i=1;i<=red;i++)
            {
                String str = sc.next();
                if(map.containsKey(str))
                {
                    int value = map.get(str);
                    map.remove(str);
                    map.put(str,value-1);
                }
            }
            int ans =0;
            for(Map.Entry<String,Integer> x:map.entrySet())
            {
                ans = max(ans,x.getValue());
            }
            out.println(ans);
        out.flush();
    }
    private static int max(int a,int b)
    {
        if(a>b)
            return a;
        else
            return b;
    }
}
