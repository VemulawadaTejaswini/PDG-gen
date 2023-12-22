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
     
     int w = sc.nextInt();
     
     int h = sc.nextInt();
     
     int x = sc.nextInt();
     
     int y = sc.nextInt();
     
     int r = sc.nextInt();
     
     coordinate(w,h,x,y,r);
   }
   static void coordinate(int w,int h,int x,int y,int r)
   {//X-axis judgment
     if(x - r < 0 || x + r > w)
     {
       System.out.println("No");
       
       return ;
     }
     if(y - r < 0 || y + r > h)
     {
       System.out.println("No");
       
       return ;
     }
     else System.out.println("Yes");
     
     return ;
   }
 }
    
