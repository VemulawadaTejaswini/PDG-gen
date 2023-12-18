import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        
        int cost[] = new int[n];
        int cur = 0;
        for (int i = 0; i < n; i++) {
            cur = 0;
            cost[i] = 0;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    cost[i] += Math.abs(a[j] - cur);
                    cur = a[j];
                }
            }
            cost[i] += Math.abs(cur);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(cost[i]);
        }
    }
}
