import java.util.Scanner;
class Main()
{
 public static void main(String args[])
 {
  int a,b,c,i,g=0;
  Scanner sc = new Scanner(System.in);
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  for(i=a;a<=b;i++)
  {
   if(c%i==0)
      g++;
  }
  System.out.println(g);
 }
}
