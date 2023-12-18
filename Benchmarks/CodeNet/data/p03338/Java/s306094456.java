import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    
    int max = 0;
    for (int i = 1; i < N-1; i++) {
      int num = calc(S, i);
      if (num > max) {
        max = num;
      }
    }
    
    System.out.println(max);
  }
  
  private static int calc(String s, int pos) {

    int[] left = new int[26];
    for (int i = 0; i <= pos-1; i++) {
      left[s.charAt(i) - 'a'] = 1;
    }

    int ret = 0;
    for (int i = pos; i < s.length(); i++) {
      if (left[s.charAt(i) - 'a'] == 1) {
        left[s.charAt(i) - 'a'] = 0;
        ret++;
      }
    }

    return ret;
  }
}