import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int[][] array = new int[n][2];
        for (int i = 0; i < n; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }
        Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));    // foo[][0]で
        
        long cost = 0;
        for (int i = 0; i < n; i++) {
            int price = array[i][0];
            int amount = array[i][1];
            if (k <= amount) {
                cost += price * k;
                System.out.println(cost);
                return;
            } else {
                cost += price * amount;
                k -= amount;
            }
        }
    }
}
