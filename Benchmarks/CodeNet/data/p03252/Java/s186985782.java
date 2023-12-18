import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    char[] S = scn.nextLine().toCharArray();
    char[] T = scn.nextLine().toCharArray();
    int size = S.length;

    HashMap<Character, Character> map1 = new HashMap<>();
    HashMap<Character, Character> map2 = new HashMap<>();

    String ans = "Yes";
    for (int i = 0; i < size; i++) {
      if (!map1.containsKey(S[i])) {
        map1.put(S[i], T[i]);

      } else if (map1.get(S[i]) != T[i]) {
        ans = "No";
        break;
      }

      if (!map2.containsKey(T[i])) {
        map2.put(T[i], S[i]);
      } else if (map2.get(T[i]) != S[i]) {
        ans = "No";
        break;
      }
    }

    System.out.println(ans);
  }

}
