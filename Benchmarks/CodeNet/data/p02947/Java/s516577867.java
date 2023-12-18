import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Boolean> hashmap = new HashMap<String, Boolean>();
    int number, i, tmp;
    number = Integer.parseInt(sc.next());
    String[] str_array = new String[number];
    for(i = 0; i < number; i++) {
      str_array[i] = sc.next();
      str_array[i] = stringSort(str_array[i]);
      hashmap.put(str_array[i], true);
    }
    tmp = hashmap.size();
    System.out.println(number - tmp);
  }

  static String stringSort(String str) {
    char[] ch = str.toCharArray();

    Arrays.sort(ch);
    String st = new String(ch);
    return st;
  }
}
