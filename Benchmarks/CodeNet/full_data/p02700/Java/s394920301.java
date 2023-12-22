import java.util.Scanner;


public class Main{
    
      public static int a,b,c,d;
      
      public static String solve(){
           int tak = 0,aok = 0;
           tak = ((c+b-1)/b);
           aok = ((a+d-1)/d);
           if( tak - aok <= 0 ) return "Yes";
           return "No";
      }
  	  public static void read(){
         Scanner x = new Scanner(System.in);
         a = x.nextInt();
         b = x.nextInt();
         c = x.nextInt();
         d = x.nextInt();   
      }

       public static void main(String []args){

         read();
         System.out.println(solve());
        
      }
}