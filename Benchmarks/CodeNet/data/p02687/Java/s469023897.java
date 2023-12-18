import java.util.Scanner;

public class Main{
  public static void main(String arg[]){
    Scanner scan = new Scanner(System.in);
    
    String abc = scan.nextLine();
    
    if(abc.equals("ABC")){
      System.out.println("ARC");
    }else{
      System.out.println("ABC");
    }
  }
}