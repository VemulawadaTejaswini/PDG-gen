import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();
    int n = N/2;
    
    int ans = N/26;
    c : for(int i = n; i > ans ; i--){
      for(int j = 0; N-(j+i) >= i; j++){
        String T = new String(S.substring(j, j+i));
        String U = new String(S.substring(j+i));
        if(U.contains(T)){
          ans = i;
          break c;
        }
      }
    }
    System.out.println(ans);
  }
}