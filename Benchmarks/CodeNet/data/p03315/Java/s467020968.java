import java.util.*;

public class Main{
  public static void main(String[] args){
    int ans = 0;
    Scanner sc = new Scanner(System.in);
    String pm = sc.next();
    char[] c = pm.toCharArray();
    for(int i=0; i<4; i++){
      if(c[i]=='+'){
        ans++;
      }else{
        ans--;
      }
    }

    System.out.println(ans);
  }
}