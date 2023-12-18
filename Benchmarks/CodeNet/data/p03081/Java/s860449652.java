import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int Q = scanner.nextInt();
        String s = scanner.next();

        Map<String, List<Integer>> map = new HashMap<>();
        int[] golemArray = new int[N];
        for (int i = 0; i < N; i++) {
            golemArray[i] = 1;

            char c = s.charAt(i);
            List<Integer> list = map.get(String.valueOf(c));
            if (list == null) {
                list = new ArrayList<>();
                map.put(String.valueOf(c), list);
            }
            list.add(i);
        }

        for (int i = 0; i < Q; i++) {
            String t = scanner.next();
            String d = scanner.next();

            List<Integer> targetList = map.get(t);
            if (targetList == null) {
                continue;
            }
            for (Integer index : targetList) {
                if (d.equals("L")) {
                    // L
                    if (index != 0) {
                        golemArray[index-1] += golemArray[index];
                    }
                    golemArray[index] = 0;
                } else {
                    // R
                    if (index != N-1) {
                        golemArray[index+1] += golemArray[index];
                    }
                    golemArray[index] = 0;
                }
            }
        }

        int ret = 0;
        for (int i = 0; i < N; i++) {
            ret += golemArray[i];
        }
        System.out.println(ret);
    }

}
