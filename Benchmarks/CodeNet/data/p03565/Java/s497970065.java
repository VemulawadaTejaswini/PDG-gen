import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    sc.close();

    String[] S = s.split("");
    String[] T = t.split("");

    int i = S.length - 1;
    int j = T.length - 1;

    // TがSに含まれる（true）か否（false）か
    boolean flg = false;

    // ?を文字に変更するリスト
    HashMap<Integer, Integer> hashMap = new HashMap<>();

    while (0 <= i) {
      if (S[i].equals(T[j]) || S[i].equals("?")) {
        hashMap.put(i,j);
        if (j == 0) {
          flg = true;
          i = -1;
        }
        j--;
      } else {
        hashMap.clear();
        j = T.length - 1;
      }
      i--;
    }

    String result = "UNRESTORABLE";

    if (flg) {
      for (Map.Entry<Integer, Integer> map : hashMap.entrySet()) {
        S[map.getKey()]  = T[map.getValue()];
      }
      result = "";
      for (int k = 0; k < S.length; k++) {
        if (S[k].equals("?")) {
          S[k] = "a";
        }
        result += S[k];
      }
    }

    System.out.println(result);

  }

}