import java.util.Scanner;
public class Main{
  public static void main(String args[]){
      Scanner l = new Scanner(System.in);
      String s = l.next();
      
      if(s.toLowerCase().equals("arc")){
         System.out.println("ABC");
        }
      else if(s.toLowerCase().equals("abc")){
          System.out.println("ARC");
        }
        else{
         System.out.println("ARC");   
        }
}
}