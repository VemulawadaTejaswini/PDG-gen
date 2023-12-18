import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] drink = new int[n];
        for (int i = 0; i < n; i++) {
            drink[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        for (int i = 0; i < x; i++) {
            int sum = 0;
            int target = sc.nextInt();
            int change = sc.nextInt();
            int tmp = drink[target - 1];
            drink[target - 1] = change;
            for (int j = 0; j < n; j++) {
                sum += drink[j];
            }
            System.out.println(sum);
            drink[target - 1] = tmp;
        }
    }
}
