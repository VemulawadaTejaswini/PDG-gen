import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    String t = sc.next();
    String ans = "";
    
    for(int i = 0;i<n;i++){
      ans = ans + s.substring(i,i+1) + t.substring(i,i+1);
    }
    
    System.out.println(ans);
    
    
  }
}