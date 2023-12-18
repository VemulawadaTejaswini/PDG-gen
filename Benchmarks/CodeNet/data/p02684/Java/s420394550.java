import java.util.*;
import java.io.*;
public class Main
{
    static BufferedReader br;
    static BufferedWriter bw;
    static void solve()throws Exception
    {
        Scanner S = new Scanner(System.in);
        int  n = S.nextInt();
        long k = S.nextLong();
        int A[] = new int[n];
        for(int i=0;i<n;i++)
        A[i] = S.nextInt();
        ArrayList<Integer> al = new ArrayList<Integer>();
        // al.add(1);
        int ptr = 0;
        for(int i=0;i<Math.min(k,100000);i++)
        {
            al.add(A[ptr]-1);
            ptr = A[ptr]-1;
        }
        if(k<100000)
        {
            bw.write(Integer.toString(al.get((int)k-1)+1));
        }
        else
        bw.write(Integer.toString(al.get((int)(k%al.size()))+1));
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