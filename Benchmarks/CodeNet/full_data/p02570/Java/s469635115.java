import java.io.*;

class Main
{
    public static void main(String args[])throws Exception
    {
        BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb=new StringBuilder();
        String s[]=bu.readLine().split(" ");
        int d=Integer.parseInt(s[0]),t=Integer.parseInt(s[1]),sp=Integer.parseInt(s[2]);
        if(t*sp>=d) sb.append("Yes");
        else sb.append("No");
        System.out.print(sb);
    }
}
