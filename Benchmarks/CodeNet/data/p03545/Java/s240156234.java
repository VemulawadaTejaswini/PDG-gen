import java.util.*;
public class Main {
   public static void main(String[] args) {  
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      int[] num = new int[s.length()];
      for(int i = 0; i < s.length(); i++){
         num[i] = Integer.parseInt(s.charAt(i)+"");
      }
      
      int a = num[0];
      int b = num[1];
      int c = num[2];
      int d = num[3];
      if(a+b+c+d==7)
         System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
      else if(a+b+c-d==7)
         System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
      else if(a+b-c-d==7)
         System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
      else if(a-b-c-d==7)
         System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
      else if(a+b-c+d==7)
         System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
      else if(a-b-c+d==7)
         System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
      else if(a-b+c+d==7)
         System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
      else 
         System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
   }
}