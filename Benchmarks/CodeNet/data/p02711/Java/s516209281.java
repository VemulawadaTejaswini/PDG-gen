import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    String ans;
    
    if(n.charAt(0)=='7'||n.charAt(1)=='7'||n.charAt(2)=='7') ans = "Yes";
    else ans = "No";
    System.out.println(ans);
    
  }
}