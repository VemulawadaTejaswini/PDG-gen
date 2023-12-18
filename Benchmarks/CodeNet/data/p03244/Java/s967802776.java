import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Map<Integer, Integer> oddMap = new HashMap<>();
        Map<Integer, Integer> evenMap = new HashMap<>();
        int currentVal = 0;
        for (int i = 0; i < n; i++) {
            currentVal = sc.nextInt();
            if (i % 2 == 0) {
                oddMap.put(currentVal, oddMap.getOrDefault(currentVal, 0) + 1);
            } else {
                evenMap.put(currentVal, evenMap.getOrDefault(currentVal, 0) + 1);
            }
        }

        List<Entry<Integer, Integer>> oddEntries = new ArrayList<Entry<Integer, Integer>>(oddMap.entrySet());
        List<Entry<Integer, Integer>> evenEntries = new ArrayList<Entry<Integer, Integer>>(evenMap.entrySet());

        Collections.sort(oddEntries, new Comparator<Entry<Integer,Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        Collections.sort(evenEntries, new Comparator<Entry<Integer,Integer>>() {
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2){
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
        int oddMode = oddEntries.get(0).getKey();
        int oddModeCnt = oddEntries.get(0).getValue();
        int evenMode = evenEntries.get(0).getKey();
        int evenModeCnt = evenEntries.get(0).getValue();
        int ans = 0;
        if (oddMode != evenMode){
            ans = n - (oddModeCnt + evenModeCnt);
            System.out.println(ans);
        } else {
            if (oddEntries.size() == 1){
                ans = n - (oddModeCnt);
            } else {
                int ans1 =0;
                int ans2 =0;
                ans1 = n - (oddModeCnt + evenEntries.get(1).getValue());
                ans2 = n - (oddEntries.get(1).getValue() + evenModeCnt);
                ans = Math.min(ans1, ans2);
            }
            System.out.println(ans);
        }


    }
}