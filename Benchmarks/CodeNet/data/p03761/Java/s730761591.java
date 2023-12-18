import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] count = null;
    for (int i = 0; i < n; i++) {
      String s = sc.next();
      count = solve(s, count);
    }
    
    StringBuilder ans = new StringBuilder();
    for (int i = 0; i < count.length; i++) {
      for (int j = 0; j < count[i]; j++) {
        ans.append((char)('a'+i));
      }
    }
    System.out.println(ans.toString());
  }
  
  private static int[] solve(String s, int[] count) {
    int[] count2 = new int[26];
    for (int i = 0; i < s.length(); i++) {
      int idx = s.charAt(i) - 'a';
      count2[idx]++;
    }
    if (count == null) {
      return count2;
    }
    
    for (int i = 0; i < 26; i++) {
      count[i] = Math.min(count[i], count2[i]);
    }
    return count;
  }
}