import java.util.*;

public class Main {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    String s = scan.next();

    Map<Integer, Integer> modToCount = new HashMap<>();
    int curMod = 0;
    int tenthMod = 0;
    int m = 2019;

    long count = 0;

    for (int i = s.length() - 1; i >= 0; i--) {
      int digit = s.charAt(i) - '0';

      if (i == s.length() - 1) {
        tenthMod = 1;
      }
      else {
        tenthMod = (tenthMod * 10) % m;
      }
      curMod = (curMod + digit * tenthMod) % m;

      if (curMod == 0) {
        count++;
      }

      if (modToCount.containsKey(curMod)) {
        count += modToCount.get(curMod);
      }

      // System.out.println(digit +" " + count);

      if (modToCount.containsKey(curMod)) {
        modToCount.put(curMod, modToCount.get(curMod) + 1);
      }
      else {
        modToCount.put(curMod, 1);
      }
    }

    System.out.println(count);
  }
}
