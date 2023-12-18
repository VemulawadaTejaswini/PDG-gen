import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String str[]=br.readLine().split(" ");
        int n=Integer.parseInt(str[0]);
        int a=Integer.parseInt(str[1]);
        int b=Integer.parseInt(str[2]);
        int c=Integer.parseInt(str[3]);
        int val[][]=new int[n+1][3];
        val[0][0]=a;
        val[0][1]=b;
        val[0][2]=c;
        ArrayList<Character> al=new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            String s=br.readLine();
            if(s.charAt(0)=='A'&&s.charAt(1)=='C')
            {
                if(a<c)
                {
                    a++;
                    c--;
                    al.add('A');
                }
                else
                {
                    c++;
                    a--;
                    al.add('C');
                }
            }
            else if(s.charAt(0)=='A'&&s.charAt(1)=='B')
            {
                if(a<b)
                {
                    a++;
                    b--;
                    al.add('A');
                }
                else
                {
                    b++;
                    a--;
                    al.add('B');
                }
            }
            else
            {
                if(c<b)
                {
                    c++;
                    b--;
                    al.add('C');
                }
                else
                {
                    b++;
                    c--;
                    al.add('B');
                }
            }
        }
        if(a<0||b<0||c<0)
        pw.println("NO");
        else
        {
            pw.println("YES");
            for(int i=0;i<al.size();i++)
            pw.println(al.get(i));
        }
        pw.flush();
        pw.close();
    }
}