    import java.io.*;
    class Main
    {
      public static void main(String args[])throws IOException
      {
        int i,s1=0,s2=0,s,m,n;
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(input.readLine());
        m=Integer.parseInt(input.readLine());
        for(i=1;i<m;i++)
        {
          s1=s1+i;
        }
        for(i=1;i<n;i++)
        {
          s2=s2+i;
        }
        s=s1+s2;
        System.out.println(s);
      }
    }