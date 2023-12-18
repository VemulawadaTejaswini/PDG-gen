import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int ans = 0;
        for (int tmp = 0;; tmp++) {
            int head = list.getFirst();
            int cnt = 0;
            for (Iterator<Integer> ite = list.iterator(); ite.hasNext();) {
                int p = ite.next();
                if (p <= head) {
                    ite.remove();
                    if (p != head) {
                        cnt++;
                    }
                }
            }
            if (cnt != 0) {
                ans += cnt + tmp;
            }

            if (check(list)) {
                break;
            }

            int foot = list.getLast();
            cnt = 0;
            for (Iterator<Integer> ite = list.iterator(); ite.hasNext();) {
                int p = ite.next();
                if (foot <= p) {
                    ite.remove();
                    if (foot != p) {
                        cnt++;
                    }
                }
            }
            if (cnt != 0) {
                ans += cnt + tmp;
            }

            if (check(list)) {
                break;
            }
        }

        System.out.println(ans);
    }

    private boolean check(List<Integer> list) {
        if (list.isEmpty()) {
            return true;
        }

        Iterator<Integer> ite = list.iterator();
        int head = ite.next();
        while (ite.hasNext()) {
            int p = ite.next();
            if (head > p) {
                return false;
            }
            head = p;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
