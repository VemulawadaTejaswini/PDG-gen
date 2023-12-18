import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int[] hotel = new int[n];
        for (int i = 0; i < n; i++) {
            hotel[i] = kbd.nextInt();
        }
        int cou = 0;
        for (int j = 0; j < n; j++) {
            if (j == 0) {
                cou++;
            } else {
                boolean flag = true;
                for (int k = j - 1; k > 0; k--) {
                    if (hotel[j] < hotel[k]) {
                        flag = false;
                    }
                }
                if (flag) {
                    cou++;
                }
            }
        }
        System.out.println(cou);
    }
}