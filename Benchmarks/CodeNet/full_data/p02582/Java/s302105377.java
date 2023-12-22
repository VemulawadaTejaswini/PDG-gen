import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int ans = 0;
    String a = sc.next();
    
    for (int i = 0; i < 3; i++){
      String n = a.substring(i, i+1);
      if (n.equals("R")){
        ans++;
      } else {
        ans = 0;
      }
    }
    
    System.out.println(ans);
  }
}