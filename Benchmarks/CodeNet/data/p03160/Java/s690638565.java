import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        int A[]=Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int cost[]=new int[n];
        cost[0]=0;
        cost[1]=cost[0]+Math.abs(A[1]-A[0]);
        for(int i=2;i<n;i++)
        cost[i]=Math.min(cost[i-1]+Math.abs(A[i]-A[i-1]),cost[i-2]+Math.abs(A[i]-A[i-2]));
        bw.write(Integer.toString(cost[n-1]));
        br.close();
        bw.close();
    }
}