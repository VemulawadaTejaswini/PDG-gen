import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
        PrintWriter pw=new PrintWriter(System.out);
        double max=-1;
        int dim=Integer.parseInt(br.readLine());
        /*if(dim%3==0)
        pw.println(Math.pow(dim/3,3));
        else if(dim%3==0)
        pw.println(Math.pow(dim/3,2)*(dim/3+1));
        else
        pw.println(Math.pow(dim/3+1,2)*(dim/3));*/
        for(int i=1;i<=1000;i++)
        {
            for(int j=1;j<=1000;j++)
            {
                for(int k=1;k<=1000;k++)
                {
                    if(i+j+k==dim)
                    {
                        max=Math.max(max,(double)i*j*k);
                    }
                }
            }
        }
        System.out.println(max);
        pw.flush();
        pw.close();
    }
}