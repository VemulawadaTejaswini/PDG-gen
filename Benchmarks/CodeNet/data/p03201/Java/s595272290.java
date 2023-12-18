import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextLong());
        }

        sc.close();

        Collections.sort(list, Comparator.reverseOrder());

        long ans = 0;

        while (list.size() > 0) {
            for (int j = 1; j < list.size(); j++) {
                long max = list.get(0);
                long num = max + list.get(j);
                if ((num & (num - 1)) == 0) {
                    ans++;
                    list.remove(j);
                    break;
                }
            }
            list.remove(0);
        }

        System.out.println(ans);
    }
}
