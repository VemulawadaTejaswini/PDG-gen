import java.util.*;

public class Main {

    private static int N;
    private static int Q;
    private static Map<Character, List<Integer>> char2Ids;
    private static int[] id2Cnt;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = sc.nextInt();
        String s = sc.next();

        char2Ids = new HashMap<>();
        int id = 0;
        for (char si : s.toCharArray()) {
            if (char2Ids.containsKey(si)) {
                char2Ids.get(si).add(id);
            } else {
                List<Integer> ids = new LinkedList<>();
                ids.add(id);
                char2Ids.put(si, ids);
            }
            id += 1;
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
        Queue<Integer> prevCnts = new LinkedList<>();
        for (int id : ids) {
            prevCnts.add(id2Cnt[id]);
        }
        if (cmd == 'L') {
            for (int id : ids) {
                int prevCnt = prevCnts.poll();
                if (id > 0) {
                    id2Cnt[id - 1] += prevCnt;
                }
                id2Cnt[id] = 0;
            }
        } else {
            Deque<Integer> idsReverse = new LinkedList<>();
            for (int id : ids) {
                idsReverse.addLast(id);
            }
            for (int i = 0; i < idsReverse.size(); i += 1) {
                int id = idsReverse.removeLast();
                int prevCnt = prevCnts.poll();
                if (id < id2Cnt.length - 1) {
                    id2Cnt[id + 1] += prevCnt;
                }
                id2Cnt[id] = 0;
            }
        }
    }

}
