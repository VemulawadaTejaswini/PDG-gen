import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String str[]=br.readLine().split(" ");
        int arr[]=new int[n+1];
        //TreeSet<String> ts=new TreeSet<>();
        for(int i=1;i<=n;i++)
        arr[i]=Integer.parseInt(str[i-1]);
        int cntr=0;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]+1+i<=n&&arr[arr[i]+i+1]+arr[i]==(int)Math.abs(arr[i]+1))
            cntr++;
        }
        pw.println(cntr);
        pw.flush();
        pw.close();
    }
}