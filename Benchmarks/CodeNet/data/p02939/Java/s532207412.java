import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc =  new Scanner(System.in);
    String S = sc.nextLine();
    
    int n = S.length();
    char c1 = S.charAt(0);
    int ans = 1;
    for(int i = 1; i < n; i++){
      char c2 = S.charAt(i);
      if(c1 == c2){
        i++;
        ans++;
        c1 = ',';
        continue;
      }
      
      ans++;
      if(i == n){
        break;
      }
      
      c1 = c2;
    }
    System.out.println(ans);
  }
}
    