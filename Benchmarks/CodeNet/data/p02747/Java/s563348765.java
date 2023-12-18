import java.util.Scanner;
 
public class A{
  public static void main(String args[]){ 
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    String[] strArray = str.split("hi", 0)
    if(strArray.length()*2 == str.length()){
      System.out.print("Yes");
    }else {
      System.out.print("No");
    }
   }
}