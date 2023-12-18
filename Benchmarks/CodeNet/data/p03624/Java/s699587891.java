import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    char[] arr = sc.next().toCharArray();
    Set<Character> set = new TreeSet<>();
    for (char c : arr) {
      set.add(c);
    }

    int cnt = (int) 'a';
    boolean isExist = true;
    for (char c : set) {
      if (cnt == (int) c) {
        cnt++;
      } else {
        isExist = false;
        break;
      }
    }
    System.out.println(isExist ? "None" : (char)cnt);
  }
}
