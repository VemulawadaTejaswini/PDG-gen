import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    HashMap<String, Integer> hashMap = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String s_ = sc.next();
      String[] s_array = s_.split("");
      Arrays.sort(s_array);
      String key = "";
      for (int j = 0; j < s_array.length; j++) {
        key += s_array[j];
      }
      if (hashMap.containsKey(key)) {
        int v_ = hashMap.get(key);
        hashMap.put(key, v_ + 1);
      } else {
        hashMap.put(key, 1);
      }
      
    }

    sc.close();

    long count = 0;

    for (Map.Entry<String, Integer> map : hashMap.entrySet()) {

      for (int i = 1; i <= map.getValue(); i++) {
        count += i - 1;
      }
    
    }

    System.out.println(count);

  }

}