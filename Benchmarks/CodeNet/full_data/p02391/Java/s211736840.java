import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
    comp();
   }
   static  void  comp()
   {
     Scanner sc = new Scanner(System.in);
     
     int a = sc.nextInt();
     
     int b = sc.nextInt();
     
     if (a < b)System.out.println("a < b");
     
     else if(a > b)System.out.println("a > b");
     
     else System.out.println("a == b");
   }
 }
    
