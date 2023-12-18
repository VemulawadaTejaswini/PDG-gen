import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    if(judge_parin(s)) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
  public static boolean judge_parin(String s) {
    int[] count = new int[3];
    int gap = 0;
    char[] list = s.toCharArray();
    Arrays.fill(count, 0);
    for(int i = 0; i < list.length; i++) {
      if(list[i] == 'a') {
        count[0]++;
      } else if(list[i] == 'b') {
        count[1]++;
      } else {
        count[2]++;
      }
    }
    Arrays.sort(count);
    gap = count[2] - count[0];
    if(gap > 1) {
      return true;
    } else {
      return false;
    }
  }
}
