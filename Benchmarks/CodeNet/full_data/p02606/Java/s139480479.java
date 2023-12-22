import java.io.*;
class Multiple
{
  int L,R,d;
  public static void main(String args[])throws IOException
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    System.out.println("Enter the upper limit integer:-");
    int R=Integer.parseInt(br.readLine());
    System.out.println("Enter the lower limit integer:-");
    int L=Integer.parseInt(br.readLine());
    System.out.println("Enter the integer whose multiple you want:-");
    int d=Integer.parseInt(br.readLine());
    int m=0;
    for(int i=L;i<=R;i++)
    {
      if(i%d==0)
      {
        m++;
      }
    }
    System.out.println(m);
  }
}