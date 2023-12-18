import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            final HashMap<Integer, Integer> oddNums = new HashMap<>();
            final HashMap<Integer, Integer> evenNums = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                HashMap<Integer, Integer> target = (i % 2 == 1 ? oddNums : evenNums);
                Integer cnt = 0;
                if (target.containsKey(num)) {
                    cnt = target.get(num);
                }
                cnt++;
                target.put(num, cnt);
            }

            ArrayList<Entry<Integer, Integer>> oddList = new ArrayList<>(oddNums.entrySet());
            ArrayList<Entry<Integer, Integer>> evenList = new ArrayList<>(evenNums.entrySet());

            sortValues(oddList);
            sortValues(evenList);

            Entry<Integer, Integer> oddEntry = oddList.get(0);
            Entry<Integer, Integer> evenEntry = evenList.get(0);
            if (oddEntry.getKey() != evenEntry.getKey()) {
                // System.out.println(String.format("odd:%s, even:%s", oddEntry.getValue(),
                // evenEntry.getValue()));
                System.out.println(n - oddEntry.getValue() - evenEntry.getValue());
                return;
            } else {
                int oddCnt = oddEntry.getValue();
                int evenCnt = evenEntry.getValue();
                if (oddCnt > evenCnt) {
                    System.out.println(n - oddCnt - evenList.get(1).getValue());
                    // System.out.println("odd Win");
                    return;
                } else if (oddCnt < evenCnt) {
                    System.out.println(n - oddList.get(1).getValue() - evenCnt);
                    // System.out.println("even Win");
                    return;
                }

                // System.out.println(String.format("odd:%s, even:%s", oddCnt, evenCnt));
                if (1 == oddList.size()) {
                    System.out.println(n / 2);
                    return;
                }

                Entry<Integer, Integer> rOddEntry = oddList.get(1);
                Entry<Integer, Integer> rEvenEntry = evenList.get(1);
                int rOddCnt = rOddEntry.getValue();
                int rEvenCnt = rEvenEntry.getValue();
                if (rOddCnt > rEvenCnt) {
                    System.out.println(n - oddCnt - evenList.get(1).getValue());
                    return;
                } else {
                    System.out.println(n - oddList.get(1).getValue() - evenCnt);
                    return;
                }

            }

        }
    }

    private static void sortValues(ArrayList<Entry<Integer, Integer>> list) {
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
    }

}
