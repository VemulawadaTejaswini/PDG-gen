import java.util.*;

public class Main {

    private static int N;
    private static int Q;
    private static Map<Character, List<Integer>> char2Ids;
    private static Map<Character, List<Integer>> char2IdsReversed;
    private static int[] id2Cnt;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        String s = sc.next();

        char2Ids = new HashMap<>();
        for (int id = 0; id < N; id += 1) {
            char si = s.charAt(id);
            if (char2Ids.containsKey(si)) {
                char2Ids.get(si).add(id);
            } else {
                List<Integer> ids = new LinkedList<>();
                ids.add(id);
                char2Ids.put(si, ids);
            }
        }
        char2IdsReversed = new HashMap<>();
        for (int id = N - 1; id >= 0; id -= 1) {
            char si = s.charAt(id);
            if (char2IdsReversed.containsKey(si)) {
                char2IdsReversed.get(si).add(id);
            } else {
                List<Integer> ids = new LinkedList<>();
                ids.add(id);
                char2IdsReversed.put(si, ids);
            }
        }

        id2Cnt = new int[N];
        for (int i = 0; i < N; i += 1) {
            id2Cnt[i] = 1;
        }

        for (int i = 0; i < Q; i += 1) {
            char c = sc.next().charAt(0);
            char cmd = sc.next().charAt(0);
            if (char2Ids.containsKey(c)) {
                aria(c, cmd);
            }
        }

        int remaining = 0;
        for (int cnt : id2Cnt) {
            remaining += cnt;
        }
        System.out.println(remaining);
    }

    private static void aria(char c, char cmd) {
        List<Integer> ids = char2Ids.get(c);
        List<Integer> idsReversed = char2IdsReversed.get(c);
        Deque<Integer> prevCnts = new LinkedList<>();
        for (int id : ids) {
            prevCnts.addLast(id2Cnt[id]);
        }

        if (cmd == 'L') {
            for (int id : ids) {
                int prevCnt = prevCnts.removeFirst();
                if (id > 0) {
                    id2Cnt[id - 1] += prevCnt;
                }
                id2Cnt[id] = 0;
            }
        } else {
            for (int id : idsReversed) {
                int prevCnt = prevCnts.removeLast();
                if (id < id2Cnt.length - 1) {
                    id2Cnt[id + 1] += prevCnt;
                }
                id2Cnt[id] = 0;
            }
        }
    }

}
