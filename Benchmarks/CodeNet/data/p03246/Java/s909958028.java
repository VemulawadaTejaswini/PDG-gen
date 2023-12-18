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
                HashMap<Integer, Integer> target = (i % 2 == 0 ? oddNums : evenNums);
                Integer cnt = 0;
                if (target.containsKey(num)) {
                    cnt = target.get(cnt);
                    cnt = cnt == null ? 0 : cnt;
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
                System.out.println((oddList.size() - oddEntry.getValue()) + (evenList.size() - evenEntry.getValue()));
                return;
            } else {
                int oddCnt = oddEntry.getValue();
                int evenCnt = evenEntry.getValue();
                if (oddCnt > evenCnt) {
                    System.out.println((oddList.size() - oddCnt) + (evenList.size() - evenList.get(1).getValue()));
                    return;
                } else if (oddCnt < evenCnt) {
                    System.out.println((oddList.size() - oddList.get(1).getValue()) + (evenList.size() - evenCnt));
                    return;
                }

                if (1 == oddList.size()) {
                    System.out.println(n / 2);
                    return;
                }

                Entry<Integer, Integer> rOddEntry = oddList.get(1);
                Entry<Integer, Integer> rEvenEntry = evenList.get(1);
                int rOddCnt = rOddEntry.getValue();
                int rEvenCnt = rEvenEntry.getValue();
                if (rOddCnt > rEvenCnt) {
                    System.out
                        .println((oddList.size() - oddCnt) + (evenList.size() - evenList.get(1).getValue()));
                    return;
                } else {
                    System.out
                        .println((oddList.size() - oddList.get(1).getValue()) + (evenList.size() - evenCnt));
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
