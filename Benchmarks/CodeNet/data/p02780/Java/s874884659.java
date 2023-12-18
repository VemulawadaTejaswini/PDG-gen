import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        int max = 0;
        int num = 0;

        for (int j = 0; j < k; j++) {
            num += list.get(j);
        }

        for (int i = 0; i < n - k; i++) {

            num -= list.get(i);
            num += list.get(i + k);

            if (num > max) {
                max = num;
            }

        }

        double ans = (double)((max + k) / 2);

        System.out.println(ans);

    }
}