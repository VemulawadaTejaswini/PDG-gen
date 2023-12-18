import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N =sc.nextInt();
    String S =sc.next();
    
    int ans = 0;
    for(int i = 1; i < N; i++) {
      Set<String> front = new HashSet<>(Arrays.asList(S.substring(0, i).split("")));
      Set<String> back = new HashSet<>(Arrays.asList(S.substring(i, N).split("")));
      int count = 0;
      for(String value: front) {//
        if (back.contains(value)) {
          count++;
        }
      }
      if (count > ans) {
        ans = count;
      }
    }
    System.out.println(ans);
  }
}
 
    
    