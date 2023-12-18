import java.util.Scanner;
import static java.lang.System.out;
public class Main{
  static Scanner sc=new Scanner(System.in);

   public static void main(String[] args){
      String c1 = sc.next();
      String c2 = sc.next();
      String c3 ="";
      for(int i =3;i>0;i--){
         c3 += c1.substring(i-1,i);
      }
      out.println(c3);
      

      if(c3.equals(c2)){
         out.println("YES");
      }else{
         out.println("NO");
      }
    
    
  } 
}