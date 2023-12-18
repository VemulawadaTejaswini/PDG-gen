import java.util.*;

 // Compiler version JDK 11.0.2

 public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int n =1;
    while(a!=0 || c!=0)
    {
      if(n%2==1)
      c=c-b;
      else
      a=a-d;
      n++;
    }
    if(a>0)
    System.out.println("Yes");
    else
    System.out.println("No");
   }
 }
