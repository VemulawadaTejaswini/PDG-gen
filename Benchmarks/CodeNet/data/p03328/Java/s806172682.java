import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] monuments = new int[999];
        int sum = 0;
        int target_a = 0;
        int target_b = 0;
        int amin = Integer.MAX_VALUE;
        int bmin = Integer.MAX_VALUE;
        for (int i = 0; i < 999; i++) {
            sum += (i + 1);
            monuments[i] = sum;
            if (monuments[i] - a > 0 && (monuments[i] - a) < amin) {
                amin = monuments[i] - a;
            }
            if (monuments[i] - b > 0 && (monuments[i] - b) < bmin) {
                bmin = monuments[i] - b;
            }
        }
        System.out.println(amin);
    }
}
