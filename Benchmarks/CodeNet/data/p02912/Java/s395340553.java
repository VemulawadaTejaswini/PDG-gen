import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;
import java.util.Set;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    // int[] a = new int[n];
    TreeMap<Double,Integer> a = new TreeMap<>();

    for(int i = 0; i < n ; i++){
      double tmp = (double)sc.nextInt();
      Integer value = a.remove(tmp);
      // System.out.println(value + "," + tmp);
      if(value == null){
        a.put(tmp, 1);
      } else {
        a.put(tmp, value + 1);
      }
    }
    // System.out.println();

    for(int i = 0; i < m ; i++){
      Map.Entry<Double,Integer> tmp = a.pollLastEntry();
      Double value = tmp.getKey();
      Integer zan = tmp.getValue();
      // System.out.println(value + "," + zan);
      if(zan > 1) {
        a.put(value, zan - 1);
      }
      Double key = value / 2d;
      Integer count = a.remove(key);
      if(count == null){
        count = 0;
      }
      a.put(key, count + 1);

    }

    // System.out.println();
    long ans = 0l;

    Set<Double> keySet = a.keySet();
    for(double key: keySet){
      // System.out.println(key + "," + a.get(key));
      ans += (long)key * (long)a.get(key);
    }

    System.out.println(ans);
  }
}
