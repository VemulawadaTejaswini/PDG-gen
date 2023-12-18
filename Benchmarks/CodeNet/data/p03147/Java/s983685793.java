import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = in.nextInt();
        }

        boolean needsWatering = true;
        int numWaters = 0;
        while (needsWatering) {
            needsWatering = false;
            for (int i = 0; i < n; i++) {
                if (h[i] != 0) {
                    h[i]--;
                    needsWatering = true;
                    if (i == n - 1 || h[i + 1] == 0) {
                        numWaters++;
                    }
                }
            }
        }

        System.out.println(numWaters);

    }
}
