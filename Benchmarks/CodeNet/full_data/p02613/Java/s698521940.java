import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
    int n,i,c0=0,c1=0,c2=0,c3=0;
    String s;
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
      for(i=0;i<n;i++)
      {
         s = in.next();
         if(s.equals("AC"))
       {
           c0++;
       }
       else if(s.equals("WA"))
       {
           c1++;
       }
       else if(s.equals("TLE"))
       {
           c2++;
       }
       else if(s.equals("RE"))
       {
           c3++;
       }
       else
       {
           System.out.println("Invalid data");
       }
      }
   
   System.out.println("AC * "+c0);
   System.out.println("WA * "+c1);
   System.out.println("TLE * "+c2);
   System.out.println("RE * "+c3);
}
}
