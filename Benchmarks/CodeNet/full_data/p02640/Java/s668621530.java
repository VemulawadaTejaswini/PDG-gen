import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    int y = sc.nextInt();
    
    String ans = "Yes";
    
    if(y%2 != 0||2*x > y||4*x < y){
      ans = "No";
    }
    
    System.out.println(ans);
  }
}