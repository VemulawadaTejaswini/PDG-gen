import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();
    long K = sc.nextLong();

    sc.close();

    String[] s = S.split("");
    
    HashMap<Integer, Integer> map = new HashMap<>();

    int count = 0;
    map.put(count, 1);
    for (int i = 1; i < s.length; i++) {
      if (s[i - 1].equals(s[i])) {
        int v_ = map.get(count);
        map.put(count, v_ + 1);
      } else {
        count++;
        map.put(count, 1);
      }
    }

    if (map.size() == 1) {
    
      System.out.println(s.length * K / 2);
    
    } else {

      int result = 0;
      int size = map.size();
      
      if (!s[0].equals(s[s.length-1])){
        for (int i = 0; i < size; i++) {
          int v_ = map.get(i);
          result += v_ / 2;
        }
        System.out.println(result * K);
      } else {
        for (int i = 0; i < size; i++) {
          int v_ = map.get(i);
          result += v_ / 2;
        }
        int a1 = map.get(0) / 2 + map.get(size - 1) / 2;
        int a2 = (map.get(0) + map.get(size - 1)) / 2;
        System.out.println(result * K - (a2 - a1) * (K - 1));
      }

    }

  }

}