import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] dish = new int[5];
        int maxIndex = 0;
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            dish[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            int order = dish[i];
            while (order >= dish[i] && order % 10 != 0) {
                order++;
            }
            if (max < order - dish[i]) {
                max = order - dish[i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < 5; i++) {
            if (i == maxIndex) continue;
            if (dish[i] % 10 != 0) {
                while (dish[i] % 10 != 0) {
                    dish[i]++;
                }
            }
        }
        for (int tmp : dish) {
            sum += tmp;
        }
        System.out.println(sum);
    }
}
