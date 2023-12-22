import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int total = 0;
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                total += x;
                list.add(x);
            }
            boolean flag = false;
            int idx = 1;
            while (idx * (idx + 1) / 2 <= total) {
                if (idx * (idx + 1) / 2 == total) {
                    flag = true;
                    break;
                }
                idx++;
            }
            if (!flag) {
                sb.append(-1).append("\n");
                continue;
            }
            int ans = -1;
            for (int i = 0; i <= 10000; i++) {
                boolean match = true;
                for (int j = 0; j < list.size(); j++) {
                    if (j + 1 != list.get(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    ans = i;
                    break;
                }
                int added = list.size();
                for (int j = list.size() - 1; j >= 0; j--) {
                    if (list.get(j) == 1) {
                        list.remove(j);
                    } else {
                        list.set(j, list.get(j) - 1);
                    }
                }
                list.add(added);
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}

