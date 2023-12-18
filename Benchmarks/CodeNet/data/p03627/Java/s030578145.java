import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;


public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    TreeMap<Integer,Integer> map = new TreeMap<>();
    for (int i=0; i<n; i++) {
      int a = sc.nextInt();
      if (map.containsKey(a)) {
        map.put(a, map.get(a)+1);
      } else {
        map.put(a, 1);
      }
    }

    Entry<Integer, Integer> val = map.pollLastEntry();
    if (val.getValue()<2) {
      System.out.println(0);
    } else if (val.getValue()>3) {
      int key = val.getKey();
      System.out.println(key*key);
    } else {
      if (map.isEmpty()) {
        System.out.println(0);
      } else {
        Entry<Integer, Integer> val2 = map.pollLastEntry();
        if (val2.getValue()<2) {
          System.out.println(0);
        } else {
          int key = val.getKey();
          int key2 = val2.getKey();
          System.out.println(key*key2);
        }
      }
    }
    sc.close();
  }
}