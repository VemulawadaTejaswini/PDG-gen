import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String[] s = new String[n];
    long ans = 0;

    for(int i = 0; i < n; i++){
      s[i] = sc.next();
      ans += 1;
      for(int j = 0; j < i; j++){
        if(s[i].equals(s[j])){
          ans -= 1;
        }
      }
    }

    System.out.println(ans);
  }
}
