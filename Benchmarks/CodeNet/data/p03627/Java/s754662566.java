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

    int a1=0;
    while (!map.isEmpty()) {
      Entry<Integer, Integer> val = map.pollLastEntry();
      if (val.getValue()<2)
        continue;
      else if (val.getValue()>3) {
        if (a1==0) {
          int key = val.getKey();
          System.out.println(key*key);
          return;
        } else {
          int key = val.getKey();
          System.out.println(a1*key);
          return;
        }
      } else {
        if (a1==0) {
          a1 = val.getKey();
        } else {
          int key = val.getKey();
          System.out.println(a1*key);
          return;
        }
      }
    }
    System.out.println(0);
    sc.close();
  }
}