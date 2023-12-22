import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        String f[]=new String[n];
        String field[][]=new String[n][m];
        for (int i=0;i<n;++i) {f[i]=sc.next();}
        for (int i=0;i<n;++i)
        {
            for (int j=0;j<m;++j)
            {
                field[i][j]=f[i].substring(j,j+1);
            }
        }

        int ans=0;
        for (int i=0;i<n;++i)
        {
            int count=0;
            for (int j=0;j<m;++j)
            {
                if (field[i][j].equals("#")) { count=0;}
                else
                {
                    ++count;
                    if (d<=count) {++ans;}
                }
            }
        }

        for (int i=0;i<m;++i)
        {
            int count=0;
            for (int j=0;j<n;++j)
            {
                if (field[j][i].equals("#")) { count=0;}
                else
                {
                    ++count;
                    if (d<=count) {++ans;}
                }
            }
        }

        System.out.println(ans);
    }
}
