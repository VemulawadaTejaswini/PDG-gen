import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] list = new long[n];

        ArrayList<Long> ans = new ArrayList<>();

        for (int i = 0; i < n ; i++) {
            list[i] = sc.nextLong();
        }

        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                ans.add(list[i] * list[j]);
            }
        }

        Collections.sort(ans);

        System.out.println(ans.get(k - 1));
    }
}
