import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) list.add(scan.next());
        Collections.sort(list);
        int cnt = 0, now = 0;
        String before = "";
        for (int i = 0; i < N; i++) {
            if (!before.equals(list.get(i))) {
                cnt = Math.max(cnt, now);
                now = 1;
            } else {
                now++;
                cnt = Math.max(cnt, now);
            }
            before = list.get(i);
        }
        now = 0;
        before = "";
        for (int i = 0; i < N; i++) {
            if (!before.equals(list.get(i))) {
                now = 1;
                if (now == cnt) System.out.println(list.get(i));
            } else {
                now++;
                if (now == cnt) System.out.println(list.get(i));
            }
            before = list.get(i);
        }
    }
}