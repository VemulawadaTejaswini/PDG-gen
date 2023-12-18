import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean[] valList = new boolean[n];
        Arrays.fill(valList, false);
        for (int i = 0; i < k; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int havingMan = sc.nextInt();
                valList[havingMan - 1] = true;
            }
        }
        sc.close();

        int result = 0;
        for (boolean b : valList) {
            if (!b) {
                result++;
            }
        }

        System.out.println(result);
    }

}