import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static long solve[][] = new long[3002][3002];
    public static char direction[][] = new char[3002][3002];
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        String t=br.readLine();
        int SL=s.length();
        int TL=t.length();
        solve[0][0]=0;
        for(int i=0;i<s.length();i++)
            solve[0][i+1]=0;
        for(int i=0;i<t.length();i++)
            solve[i+1][0]=0;
        //System.out.println(DP(0,0));
        for(int i=1;i<=SL;i++)
        {
            for(int j=1;j<=TL;j++)
            {
                if(s.charAt(i-1)==t.charAt(j-1))
                {
                    solve[i][j]=solve[i-1][j-1]+1;
                    direction[i][j]='d';
                }
                else
                {
                    if(solve[i-1][j]>solve[i][j-1])
                    {
                        solve[i][j]=solve[i-1][j];
                        direction[i][j]='u';
                    }
                    else
                    {
                        solve[i][j]=solve[i][j-1];
                        direction[i][j]='l';
                    }
                }
            }
        }
        //System.out.println(solve[SL][TL]);
        int i=SL,j=TL;
        StringBuilder sb = new StringBuilder("");
        while(i!=0&&j!=0)
        {
            if(direction[i][j]=='d')
            {
                sb.append(s.charAt(i-1));
                i--;
                j--;
            }
            else if(direction[i][j]=='u')
                i--;
            else
                j--;
        }
        System.out.println(sb.reverse().toString());
        /*for(int i=1;i<=SL;i++)
        {
            for(int j=1;j<=TL;j++)
                System.out.print(direction[i][j]+" ");
            System.out.println();
        }*/
    }
}