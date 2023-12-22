import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String ans = "";
    
    if(S.equals("ABC")){
      ans = "ARC";
    }else if(S.equals("ARC")){
      ans = "ABC";
    }
    
    System.out.println(ans);
  }
}