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
            
            char ch[]=br.readLine().toCharArray();
            ArrayList<Integer> rs=new ArrayList<>(),
            ws=new ArrayList<>();
            int c=0;
            int i;
            for(i=0;i<n;i++)
            {
                if(ch[i]=='W')
                ws.add(i);
                else
                rs.add(i);
            }
            int f=0,l=rs.size()-1;
            while(f<ws.size() && l>=0 && rs.get(l)>ws.get(f))
            {
                
                f++;
                l--;
                c++;
            }
            println(c);
            br.close();
    }
}