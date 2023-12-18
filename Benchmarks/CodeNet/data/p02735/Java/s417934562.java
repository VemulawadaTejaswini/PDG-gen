import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int h=Integer.parseInt(str[0]);
        int w=Integer.parseInt(str[1]);
        char arr[][]=new char[h][w];
        for(int i=0;i<h;i++)
        arr[i]=br.readLine().toCharArray();
        int arr2[][]=new int[h][w];
        if(arr[0][0]=='.')
        arr2[0][0]=0;
        else
        arr2[0][0]=1;
        for(int i=1;i<w;i++)
        {
            if(arr[0][i]=='.')
            arr2[0][i]=arr2[0][i-1];
            else
            arr2[0][i]=arr2[0][i-1]+1;
        }
        for(int i=1;i<h;i++)
        {
            if(arr[i][0]=='.')
            arr2[i][0]=arr2[i-1][0];
            else
            arr2[i][0]=arr2[i-1][0]+1;
        }
        for(int i=1;i<h;i++)
        {
            for(int j=1;j<w;j++)
            {
                if(arr[i][j]=='#')
                arr2[i][j]=Math.min(arr2[i-1][j],arr2[i][j-1])+1;
                else
                arr2[i][j]=Math.min(arr2[i-1][j],arr2[i][j-1]);
            }
        }
        System.out.println(arr2[h-1][w-1]);
        pw.flush();
        pw.close();
    }
}
