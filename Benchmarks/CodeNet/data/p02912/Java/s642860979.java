import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        long result = 0;
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
            result += a.get(i);
        }

        while (m < a.size()) {
            a.remove(m);
        }

        if (a.size() == 1) {
            for (int i = 0; i < m; i++) {
                int amount = a.get(0) / 2;
                result -= (a.get(0) - amount);
                a.set(0, amount);
            }
            System.out.println(result);

        } else {
            Integer[] arr = a.toArray(new Integer[a.size()]);
            Arrays.sort(arr, Collections.reverseOrder());
            for (int i = 0; i < m; i++) {
                int amount = arr[0] / 2;
                while (amount >= arr[1] && i < m) {
                    amount /= 2;
                    m--;
                }
                result -= (arr[0] - amount);
                arr[0] = amount;
                Arrays.sort(arr, Collections.reverseOrder());
            }

            System.out.println(result);
        }
    }
}
