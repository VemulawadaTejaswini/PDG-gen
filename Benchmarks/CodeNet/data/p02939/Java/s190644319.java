import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    
    String s1 = new String(S.substring(0,1));
    S = new String(S.substring(1));
    int ans = 1;
    int count = 1;
    while(S.length() > 0){
      String s2 = new String(S.substring(0, count));
      if(count == S.length() && s1.equals(s2)){
        break;
      }
      
      if(s1.equals(s2)){
        count++;
        continue;
      }
      
      s1 = s2;
      S = new String(S.substring(count));
      ans++;
      count = 1;
    }
    
    System.out.println(ans);
  }
}
    