



import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        HashMap<Integer, HashSet<Integer>> intervals = new HashMap<>();
        int [] same = new int[n + 1];
        for (int i = 0; i < m; ++i) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            HashSet<Integer> ends = intervals.getOrDefault(start, new HashSet<>());
            ends.add(end);
            intervals.put(start, ends);
        }

        for (int j = 0; j < q; ++j) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int sum = 0;
            for (int s = start; s <= end; ++s) {
                if (intervals.containsKey(s)) {
                    for (int e : intervals.get(s)) {
                        if (e <= end) {
                            ++sum;
                        }
                    }
                }
            }
            System.out.println(sum);
        }

    }
}
