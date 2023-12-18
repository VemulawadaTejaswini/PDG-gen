import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] c = s.toCharArray();
    String ans = "Good";
    
    for(int i = 1; i < 4; i++){
      if(c[i - 1] == c[i]){
        ans = "Bad";
        break;
      }
    }

    System.out.println(ans);
  }
}
