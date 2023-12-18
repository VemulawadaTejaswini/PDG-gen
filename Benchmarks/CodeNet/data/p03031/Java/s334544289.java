import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        switchList = new ArrayList<>();

        for (List<Integer> list : switchList) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        getAllpatterns(N, new ArrayList<>(), 0);

        Map<Integer, List<Integer>> lampMap = new HashMap<>();
        Map<Integer, Integer> conditionMap = new HashMap<>();
        for (int i = 1; i <= M; i++) {
            int k = sc.nextInt();
            List<Integer> switchList = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int s = sc.nextInt();
                switchList.add(s);
            }
            lampMap.put(i, switchList);
        }

        for (int i = 1; i <= M; i++) {
            conditionMap.put(i, sc.nextInt());
        }
        sc.close();

        int count = 0;
        for (List<Integer> conditions : switchList) {
            boolean isOk = true;
            for (int lamp : lampMap.keySet()) {
                List<Integer> sws = lampMap.get(lamp);
                int onCount = 0;
                for (int switchNo : sws) {
                    if (conditions.get(switchNo - 1) == 1) {
                        onCount++;
                    }
                }
                if (onCount % 2 != conditionMap.get(lamp)) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                count++;
            } else {
                continue;
            }
        }

        System.out.println(count);
    }

    public static void getAllpatterns(int N, List<Integer> switches, int cnt) {
        if (cnt >= N) {
            List<Integer> copy = new ArrayList<>(switches);
            switchList.add(copy);
            return;
        }
        switches.add(0);
        getAllpatterns(N, switches, cnt + 1);
        switches.remove(switches.size() - 1);
        switches.add(1);
        getAllpatterns(N, switches, cnt + 1);
        switches.remove(switches.size() - 1);
    }
}
