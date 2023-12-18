import java.util.*;

public class Main {

    public static void main(String[] args) {

        // read n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // read list and build map
        Map<Integer,Integer> odd_map = new HashMap<Integer,Integer>();
        Map<Integer,Integer> evn_map = new HashMap<Integer,Integer>();
        Integer odd_val; Integer evn_val;
        for (int i = 0; i < n; i+=2) {
            odd_val = sc.nextInt();
            evn_val = sc.nextInt();
            odd_map.put(odd_val, odd_map.getOrDefault(odd_val, 0)+1);
            evn_map.put(evn_val, evn_map.getOrDefault(evn_val, 0)+1);
        }

        // count
        MEntry mfeOdd = mostFrequentElement(odd_map);
        MEntry mfeEvn = mostFrequentElement(evn_map);

        int result;
        if (mfeOdd.key == mfeEvn.key){
            odd_map.remove(mfeOdd.key);
            evn_map.remove(mfeEvn.key);

            MEntry mfvOdd2 = mostFrequentElement(odd_map);
            MEntry mfvEvn2 = mostFrequentElement(evn_map);

            int res1 = n - ((int) mfvOdd2.count) - ((int) mfeEvn.count);
            int res2 = n - ((int) mfeOdd.count) - ((int) mfvEvn2.count);

            result = Math.min (res1, res2);
        } else {
            result = n - ((int) mfeOdd.count) - ((int) mfeEvn.count); 
        }

        System.out.print(result + "\n");
    }

    private static MEntry mostFrequentElement(Map<Integer,Integer> map){
        // find max
        Iterator<Map.Entry<Integer,Integer>> iter = map.entrySet().iterator();

        Integer localMaxCount = 0;
        Integer localMaxKey = -1;

        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Integer currentCount = (Integer) entry.getValue();
            if        (currentCount > localMaxCount){
                localMaxCount = currentCount;
                localMaxKey = (Integer) entry.getKey();
            }
        }

        return new MEntry (localMaxKey,localMaxCount);
    }

}

class MEntry {
    public Integer key;
    public Integer count;
    MEntry (Integer k, Integer c){
        key = k; count = c;
    }
}
