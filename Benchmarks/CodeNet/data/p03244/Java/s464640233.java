import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] seq = new int[n];

        for (int i = 0; i < n; i++) {
            seq[i] = sc.nextInt();
        }

        Map<Integer, Integer> evenBucket = new HashMap<>(); // ここでのeven/oddはインデックス基準, zero-based
        Map<Integer, Integer> oddBucket = new HashMap<>();
        evenBucket.put(-1, 0);
        oddBucket.put(-1, 0);

        for (int i = 0; i < n; i += 2) {
            if (evenBucket.containsKey(seq[i])) {
                evenBucket.put(seq[i], evenBucket.get(seq[i]) + 1);
            } else {
                evenBucket.put(seq[i], 1);
            }
        }

        for (int i = 1; i < n; i += 2) {
            if (oddBucket.containsKey(seq[i])) {
                oddBucket.put(seq[i], oddBucket.get(seq[i]) + 1);
            } else {
                oddBucket.put(seq[i], 1);
            }
        }

        List<Map.Entry<Integer, Integer>> evenBucketEntries = new ArrayList<>(evenBucket.entrySet());
        Collections.sort(evenBucketEntries, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });


        List<Map.Entry<Integer, Integer>> oddBucketEntries = new ArrayList<>(oddBucket.entrySet());
        Collections.sort(oddBucketEntries, new Comparator<Map.Entry<Integer, Integer>>() {
           public int compare(Map.Entry<Integer, Integer> obj1, Map.Entry<Integer, Integer> obj2) {
               return obj2.getValue().compareTo(obj1.getValue());
           }
        });

        int score = -1;
        int modeForEven = evenBucketEntries.get(0).getKey();
        int modeForOdd = oddBucketEntries.get(0).getKey();
        if (modeForEven == modeForOdd) {
            int score1 = evenBucketEntries.get(0).getValue() + oddBucketEntries.get(1).getValue();
            int score2 = evenBucketEntries.get(1).getValue() + oddBucketEntries.get(0).getValue();
            if (score1 > score2) {
                score = score1;
            } else {
                score = score2;
            }
        } else {
            score = evenBucketEntries.get(0).getValue() + oddBucketEntries.get(0).getValue();
        }

        System.out.println(n - score);
    }
}