import java.util.*;
import java.util.Map.Entry;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    long[] as = new long[N];
    String[] firstInput = sc.nextLine().split("[\\s]+");
    long b = 0;
    for(int i = 0; i < N; i++) {
      as[i] = Long.parseLong(firstInput[i]);
    }
    // Arrays.sort(as);
    long plusSum = 0;
    long minusSum = 0;
    long zeroSum = 0;
    // 0の時
    HashMap<Long,Integer> hm = new HashMap<>();
    b = 0;
    for(int i = 0; i < N; i++) {
      zeroSum += Math.abs(as[i] - (b + i + 1));
      if(hm.get(Math.abs(as[i]- (b+i+1))) != null) {
        hm.put(Math.abs(as[i]-(b+i+1)),hm.get(Math.abs(as[i]-(b+i+1))) + 1);
      } else {
        hm.put(Math.abs(as[i]-(b+i+1)),1);
      }
    }

    List<Entry<Long, Integer>> list_entries = new ArrayList<Entry<Long, Integer>>(hm.entrySet());

    Collections.sort(list_entries, new Comparator<Entry<Long, Integer>>() {
        //compareを使用して値を比較する
        public int compare(Entry<Long, Integer> obj1, Entry<Long, Integer> obj2)
        {
            //降順
            return obj2.getValue().compareTo(obj1.getValue());
        }
    });
    b = list_entries.get(0).getKey();
    for(int i = 0; i < N; i++) {
      plusSum += Math.abs(as[i] - (b + i + 1));
    }
    long mB = b - (b*2);
    for(int i = 0; i < N; i++) {
      minusSum += Math.abs(as[i] - (mB + i + 1));
    }
    if(zeroSum > plusSum) {
      System.out.println(plusSum);
    } else if(zeroSum > minusSum){
      System.out.println(minusSum);
    } else {
      System.out.println(zeroSum);
    }
  }
}
