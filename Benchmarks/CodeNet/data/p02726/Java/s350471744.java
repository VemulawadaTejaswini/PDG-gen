import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();
        Map<Integer, Integer> disCount = new HashMap<>();
        for (int i = 1;i <= n; i++) {
            for (int j = i + 1;j <= n; j++) {
                int dis1 = j - i;
                int dis2 = Math.abs(X-i) + 1 + Math.abs(j-Y);
                int dis3 = Math.abs(Y-i) + 1 + Math.abs(j-X);
                int min = Math.min(dis1, dis2);
                min = Math.min(min, dis3);
                int count = disCount.getOrDefault(min, 0 );
                disCount.put(min, ++count);
            }
        }

        // ans
        for (int i = 1; i <= n-1; i++) {
            System.out.println(disCount.getOrDefault(i, 0));
        }
    }

}
