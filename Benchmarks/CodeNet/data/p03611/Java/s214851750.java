import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    private final static Scanner sc = new Scanner(System.in);

    /**
     * 本処理を実行します。
     */
    public static void execute() {
        int n = nextInt();
        Map<Integer, Integer> highMap = new HashMap<>(n);
        Map<Integer, Integer> lowMap = new HashMap<>(n);
        Map<Integer, Integer> origMap = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            int a = nextInt();
            int high = a + 1;
            int low = a - 1;

            putCountMap(highMap, high);
            putCountMap(lowMap, low);
            putCountMap(origMap, a);
        }

        Map<Integer, Integer> mergeMap = Stream.of(highMap, lowMap, origMap)
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.toMap(Entry::getKey, Entry::getValue, Integer::sum));

        // マージされたマップを降順ソート
        List<Entry<Integer, Integer>> mergeEntry = new ArrayList<Entry<Integer, Integer>>(mergeMap.entrySet());
        valueReverseSort(mergeEntry);

        out(mergeEntry.get(0).getValue());
    }

    private static void valueReverseSort(List<Entry<Integer, Integer>> highEntry) {
        Collections.sort(highEntry, new Comparator<Entry<Integer, Integer>>() {
            //compareを使用して値を比較する
            public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
            {
                //降順
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });
    }

    private static void putCountMap(Map<Integer, Integer> map, int value) {
        if (map.containsKey(value)) {
            map.put(value, map.get(value) + 1);
        } else {
            map.put(value, 1);
        }
    }

    /**
     * 次の標準入力をintで受け取ります。
     * @return 標準入力値(int)
     */
    public static int nextInt() {
        return sc.nextInt();
    }

    /**
     * 次の標準入力をStringで受け取ります。
     * @return 標準入力値(String)
     */
    public static String nextString() {
        return sc.next();
    }

    /**
     * 次の標準入力を指定回数分intで受け取ります。
     * @param n 取得回数
     * @return 取得した標準入力値の配列(int)
     */
    public static int[] nextInts(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nextInt();
        }

        return arr;
    }

    /**
     * 標準出力にオブジェクトを出力します。
     * @param o 出力対象
     */
    public static void out(Object o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        execute();
    }
}