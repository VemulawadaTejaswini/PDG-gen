import java.io.*;
public class Main{
  public static void main(String args[])throws IOException
  {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    int i,c=0,flag=0;
    String s;
    for(i=0;i<n;i++)
    {
      s=br.readLine();
      if(s.charAt[0]==s.charAt[2])
        c++;
      else
        c--;
      if(c>=3)
        flag=1;
    }
    if(flag==1)
      System.out.println("YES");
    else
      System.out.println("NO");
  }
}