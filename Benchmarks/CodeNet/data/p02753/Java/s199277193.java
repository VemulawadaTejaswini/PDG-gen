import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new scan(System.in);
    String s = scan.nextLine();
    if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2)){
      System.out.println("No");
    }else{
      System.out.println('Yes');
    }
  }
}