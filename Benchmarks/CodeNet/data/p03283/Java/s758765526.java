

import javafx.util.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;



public class Main {
    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();

        HashMap<Pair<Integer, Integer>, Integer> intervals = new HashMap<Pair<Integer, Integer>, Integer>();
        for (int i = 0; i < m; ++i) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            Pair<Integer, Integer> currentPair = new Pair<>(start, end);
            if (intervals.containsKey(currentPair)) {
                intervals.put(currentPair, intervals.get(currentPair) + 1);
            } else {
                intervals.put(currentPair, 1);
            }
        }

        for (int j = 0; j < q; ++j) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = 0;
            for (int s = start; s <= end; ++s) {
                for (int e = s; e <= end; ++e) {
                    final Pair<Integer, Integer> currentPair = new Pair<>(s, e);
                    if (intervals.containsKey(currentPair)) {
                        count += intervals.get(currentPair);
                    }
                }
            }
            System.out.println(count);
        }

    }
}
