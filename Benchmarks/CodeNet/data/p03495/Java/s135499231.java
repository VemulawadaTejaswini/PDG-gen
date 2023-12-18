import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.io.PrintWriter;

public class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
            int n = sc.nextInt();
            int k = sc.nextInt();
                HashMap<Integer,Integer> map = new HashMap<>();
                for(int i=0;i<n;i++)
                {
                    int val = sc.nextInt();
                    if(map.containsKey(val))
                    {
                        map.put(val,map.get(val)+1);

                    }
                    else
                        map.put(val,1);
                }
                ArrayList<Integer> arr = new ArrayList<>(map.values());
                int cnt =0;
                for(int i = k;i<arr.size();i++)
                    cnt++;
                out.println(cnt);
        out.flush();
    }
}