
import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] P = new int[M];
        int[] Y = new int[M];
        for (int i = 0; i < M; i++) {
            P[i] = sc.nextInt();
            Y[i] = sc.nextInt();
        }

        // N県のM番目の生まれた年齢
        HashMap<Integer, PriorityQueue<Integer>> birth = new HashMap<Integer, PriorityQueue<Integer>>();
        for (int i = 0; i < M; i++) {
            PriorityQueue queue = new PriorityQueue<Integer>();
            if (birth.containsKey(P[i])) {
                queue = birth.get(P[i]);
            }
            queue.add(Y[i]);
            birth.put(P[i], queue);
        }

        HashMap<HashMap<Integer, Integer>, Integer> seqNum = new HashMap<HashMap<Integer, Integer>, Integer>();
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry: birth.entrySet()){
            Integer p = entry.getKey();
            PriorityQueue<Integer> queue = entry.getValue();
            int index = 1;
            while(!queue.isEmpty()){
                Integer y = queue.poll();
                HashMap<Integer, Integer> key = new HashMap<Integer, Integer>();
                key.put(p, y);
                seqNum.put(key, index);
                index++;
            }
        }

        for (int i = 0; i < M; i++) {
            HashMap<Integer, Integer> key = new HashMap<Integer, Integer>();
            key.put(P[i], Y[i]);
            int index = seqNum.get(key);
            out.printf("%06d%06d%n", P[i], index);
        }
    }
}
