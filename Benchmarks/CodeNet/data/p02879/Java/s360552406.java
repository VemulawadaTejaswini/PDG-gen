import java.io.*;
class Test{
  public static void main(String args[])throws IOException
  {
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    String a[]=br.readLine().split("\\s+");
    int a1=Integer.parseInt(a[0]);
    int a2=Integer.parseInt(a[1]);
    if((a1>=1 && a1<=9)||(a2>=1 && a2<=9))
      System.out.println(a1*a2);
    else
      System.out.println(-1);
    }
  }