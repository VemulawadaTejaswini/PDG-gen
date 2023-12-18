import java.util.*;
public class Main {

   public static void main(String[] args) {
        
      int a,b,c,sum;
  	Scanner scan=new Scanner(System.in); 
    String s=scan.nextLine(); 
    String[] str=s.split(" ");
    a = Integer.parseInt(str[0]);
    b = Integer.parseInt(str[1]);
    c = Integer.parseInt(str[2]);
     sum = a + b + c;
     if(sum>=22)
     {
       System.out.println("bust");
     }
     else 
     {
       System.out.println("win");
     }
   }
}