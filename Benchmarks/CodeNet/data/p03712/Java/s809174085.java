import java.io.*;
public class c
{
      public static void main(String args[])throws IOException
    {
        BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
        String[] str=b.readLine().trim().split(" ");
        int r=Integer.parseInt(str[0]);
        int c=Integer.parseInt(str[1]);
        String[] line=new String[r];
        for(int i=0;i<r;i++)
        {
            line[i]=b.readLine();
        }
        String[][] s=new String[r+2][c+2];
        for(int i=0;i<r+2;i++)
        {
            for(int j=0;j<c+2;j++)
            {
                if(i==0||i==r+1||j==0||j==c+1)
                    System.out.print("#");
                else
                {
                    System.out.print(line[i-1].charAt(j-1));
                }
                    
            }
            System.out.println();
        }
        
    }
}