import java.util.*;
import java.io.*;
public class Main
{
    static BufferedReader br;
    static BufferedWriter bw;
    static void solve()throws Exception
    {
        int input[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A = input[0];
        int B= input[1];
        int C = input[2];
        int  k= input[3];
        int sum = 0;
        if(k>=A)
        {
            sum+=A;
            k = k-A;
            A = 0;
        }
        else
        {
            sum+=k;
            k=0;
            A=A-k;
        }
        if(k>=B)
        {
            k = k-B;
            B = 0;
        }
        else
        {
            k=0;
            B=B-k;
        }
        if(k>=C)
        {
            sum-=C;
            k = k-C;
            C = 0;
        }
        else
        {
            sum-=k;
            k=0;
            C=C-k;
        }
        bw.write(Integer.toString(sum));
    }
    public static void main(String []args)throws Exception
    {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        solve();
        br.close();
        bw.close();
    }
}