import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] h = new int[s];
        for (int i = 0; i < s; i++) {
            h[i] = sc.nextInt();
        }
        int cost = h[0];
        for (int i = 1; i < s; i++) {
            cost += Math.max(h[i] - h[i-1], 0);
        }
        System.out.println(cost);

    }
}
