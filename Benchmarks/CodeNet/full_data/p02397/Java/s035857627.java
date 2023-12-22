import java.util.*;

 class Main
 {
   public static void main(String args[])
   { 
      input();
   }
   static void input()
   {
     Scanner sc = new Scanner(System.in);
     
     int x = sc.nextInt();
     
     int y = sc.nextInt();
     
      while(!(x == 0 && y == 0))
     {
       if(x > y)
       {
         int box = x;
          
         x = y;
         
         y = box;
       } 
       output(x,y);
       
       x = sc.nextInt();
       
       y = sc.nextInt();
      }
   }
  static void output(int x,int y)
    {
     System.out.printf("%d %d",x,y); 
     
     System.out.println();
   }
 }
    
