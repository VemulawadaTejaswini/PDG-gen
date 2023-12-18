import java.util.*;
public class Main {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int initial = sc.nextInt();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 1; i < N; i++) {
      int a = sc.nextInt();
      map.put(a, map.getOrDefault(a, 0)+1);
    }
    
    /*
    int xsum = 2;
    int xa = 1;
    System.out.println("xorSub(" + xsum + ", " + xa + ") = " + xorSub(xsum, xa));
    */
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      
      int sum = entry.getKey();
      int sumCount = entry.getValue();
      Map<Integer, Integer> newMap = new HashMap<>(map);

      /*
      for (Map.Entry<Integer, Integer> e:newMap.entrySet()) {
        System.out.println("# " + e.getKey() + ", " + e.getValue());
      }
      */

      sumCount--;
      if (sumCount == 0) {
        newMap.remove(sum);
      } else {
        newMap.put(sum, sumCount);
      }

      /*
      for (Map.Entry<Integer, Integer> e:newMap.entrySet()) {
        System.out.println("## " + e.getKey() + ", " + e.getValue());
      }
      */

      if (check(sum, initial, newMap, initial)) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
  
  private static boolean check(int sum, int a, Map<Integer, Integer> map, int last) {

    //System.out.println("### sum " + sum + ", a " + a + ", last " + last);
    if (map.isEmpty() && last == xorSub(sum, a)) {
      //System.out.println("### sum " + sum + ", a " + a + ", last " + last + ", empty !");
      return true;
    }
    
    int b = xorSub(sum, a);
    //System.out.println("### sum " + sum + ", a " + a + ", b " + b);
    if (!map.containsKey(b)) {
      // not found
      return false;
    }
    int countB = map.get(b);
    if (countB <= 0) {
      throw new IllegalStateException("countB > 0");
    }
    countB--;
    if (countB == 0) {
      map.remove(b);
    } else {
      map.put(b, countB);
    }
    
    return check(b, sum, map, last);
  }
  
  // 2, 1
  private static int xorSub(int sum, int a) {

    int b = 0;
    int shift = 0;
    int workSum = sum;
    int workA = a;
    while (!(workSum == 0 && workA == 0)) {
      int sumBit = workSum % 2; // 0
      int aBit = workA % 2; // 1
      int bBit = (sumBit == 0 && aBit == 1) || (sumBit == 1 && aBit == 0) ? 1 : 0;

      b |= (bBit << shift);
      
      shift++;
      workSum /= 2;
      workA /= 2;
    }

    return b;
  }
}
