import java.util.Scanner;


public class Main{
    
      public static int w,s;
      
      public static String isSafe(){
            if(w >= s) return "unsafe";
            return "safe";
      }

       public static void main(String []args){
         Scanner x = new Scanner(System.in);
         s = x.nextInt();
         w = x.nextInt();
         String ans = isSafe();
         System.out.println(ans);
        
      }
}