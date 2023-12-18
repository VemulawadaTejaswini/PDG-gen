import java.util.*;

public class Main {
    public void main(Scanner sc) {
        int n = sc.nextInt();

        TreeSet<Integer> moneySet = new TreeSet<>();
        moneySet.add(1);
        int tmp = 6;
        while (tmp <= 100000) {
            moneySet.add(tmp);
            tmp *= 6;
        }
        tmp = 9;
        while (tmp <= 100000) {
            moneySet.add(tmp);
            tmp *= 9;
        }

        Set<Integer> set = new HashSet<>();
        set.add(0);
        for (int cnt = 0;; cnt++) {
            if (set.contains(n)) {
                System.out.println(cnt);
                break;
            }

            Integer array[] = set.toArray(new Integer[0]);
            set.clear();
            for (Integer num : array) {
                for (Integer money : moneySet) {
                    set.add(num + money);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
