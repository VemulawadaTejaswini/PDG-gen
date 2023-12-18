import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String s = sc.next();
    int ans = 0;

    char c[] = s.toCharArray();

    for(int i = 0; i < n - 2; i++){
      for(int j = i + 1; j < n - 1; j++){
        for(int k = j + 1; k < n; k++){
          if(c[i] != c[j] && c[i] != c[k] && c[j] != c[k] && j - i != k - j){
            ans += 1;
          }
        }
      }
    }

    System.out.println(ans);
  }
}
