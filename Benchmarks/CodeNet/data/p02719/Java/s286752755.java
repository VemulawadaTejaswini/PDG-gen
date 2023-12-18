//created by Whiplash99
import java.io.*;
import java.util.*;
public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int i;

        String s[]=br.readLine().trim().split(" ");
        long N=Long.parseLong(s[0]);
        long K=Long.parseLong(s[1]);

        long min=N;
        N=Math.abs(N-K);
        min=Math.min(min,N);
        N=Math.abs((N-K));
        min=Math.min(min,N);

        System.out.println(min);
    }
}