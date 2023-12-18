import java.util.*;

 // Compiler version JDK 11.0.2

 public class Main
 {
   public static void main(String args[])
   { 
    Scanner sc= new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a []= new int[n];
    int v= 0;
    for(int i= 0; i<n;i++)
    {
      a[i]= sc.nextInt();
      v=v+a[i];
      
    }
    
    double q=v/(4*m);
    for(int i =0 ; i<n ;i++)
    {
      if(a[i]>q)
      m--;
      
    }
    if(m<=0)
   System.out.println("yes");
   else
   System.out.println("no");
  
   }
 }
