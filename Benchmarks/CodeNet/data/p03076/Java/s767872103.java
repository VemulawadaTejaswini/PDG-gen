import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        double[] list = new double[5];

        int min = 10;
        int minIndex = -1;

        for(int i = 0; i < 5; i++) {
            int value = sc.nextInt();
            int amari = value % 10;
            if (amari != 0 && amari < min) {
                min = amari;
                minIndex = i;
            }
            list[i] = value;
        }

        int ans = 0;

        for(int i = 0; i < 5; i++) {
            if (i == minIndex) {
                ans += list[i];
            } else {
                ans += (int) Math.ceil(list[i] / 10) * 10;
            }
        }

        // 出力
        System.out.println(ans);
    }
}