import java.util.*;
import java.io.*;
public class Main
{
    static BufferedWriter bw;
    static BufferedReader br;
    static void solve()throws Exception
    {
        int nm[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sum = 0;;
        for(int temp:A)
        {
            sum+=temp;
        }
        if(sum>=nm[0])
        bw.write("-1");
        else
        bw.write(Integer.toString(nm[0]-sum));
    }
    public static void main(String []args)throws Exception
    {
        br=new BufferedReader(new InputStreamReader(System.in));
        bw=new BufferedWriter(new OutputStreamWriter(System.out));
        // int t = Integer.parseInt(br.readLine());
        // for(int i=0;i<t;i++)
        // {
        //     bw.write("Case #"+(i+1)+": ");
            solve();
        // }
        br.close();
        bw.close();
    }
}
