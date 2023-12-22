import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    answer();
   }
   static void answer()
   {
     Scanner sc = new Scanner(System.in);
     
     int n = sc.nextInt();
     
     int[] a = new int[n];
     
     int[] b = new int[n];
     
     for(int i = 0;i < n; i ++)
     {
       a[i] = sc.nextInt();
       
       b[n - i - 1] = a[i];
     }
     for(int i = 0;i < n; i ++)
     {
       if(i != 0)System.out.printf(" ");
       
       System.out.print(b[i]);
     }
     System.out.println();
   }
 }
    
