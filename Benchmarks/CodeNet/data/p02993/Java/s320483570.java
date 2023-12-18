import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    char a = S.charAt(0);
    char b = S.charAt(1);
    char c = S.charAt(2);
    char d = S.charAt(3);
    String ans = "";
    if(a == b || b == c || c == d){
      ans = "Bad";
    }else{
      ans = "Good";
    }
    System.out.println(ans);
  }
}