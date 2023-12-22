import java.util.*;
import java.io.*;
public class Main
{
    static class comp implements Comparator<int []>
    {
        public int compare(int arr1[],int arr2[])
        {
            if(arr1[0]!=arr2[0])
            return arr1[0]-arr2[0];
            else
            return arr1[1]-arr2[1];
        }
    }
    static class comp2 implements Comparator<int []>
    {
        public int compare(int arr1[],int arr2[])
        {
            if(arr1[1]!=arr2[1])
            return arr1[1]-arr2[1];
            else
            return arr1[0]-arr2[0];
        }
    }
    public static void main(String argd[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            String str[]=br.readLine().split(" ");
            arr[i][0]=Integer.parseInt(str[0]);
            arr[i][1]=Integer.parseInt(str[1]);
        }
        Arrays.sort(arr,new comp());
        int mx=0;
        for(int i=1;i<n;i++)
        mx=Math.max(mx,arr[i][0]-arr[0][0]+(int)Math.abs(arr[i][1]-arr[0][1]));
        Arrays.sort(arr,new comp2());
        for(int i=1;i<n;i++)
        mx=Math.max(mx,(int)Math.abs(arr[i][0]-arr[0][0])+(int)Math.abs(arr[i][1]-arr[0][1]));
        pw.println(mx);
        pw.flush();
        pw.close();
    }
}