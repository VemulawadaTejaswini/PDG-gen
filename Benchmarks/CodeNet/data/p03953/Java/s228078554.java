import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Initialize rabbit list
        float[] rabbits = new float[n+1];
        for (int i = 1; i <= n; i++) {
            rabbits[i] = (float)sc.nextInt();
        }

        int m = sc.nextInt();
        int k = sc.nextInt();
        int r;

        int[] jumpList = new int[m];
        for (int i = 0; i < m; i++)
            jumpList[i] = sc.nextInt();

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m; j++) {
                r = jumpList[j];
                float pos = rabbits[r];
                rabbits[r] += rabbits[r+1] - pos + rabbits[r-1] - pos;
            }
        }

        // Print final answer
        for (int i = 1; i <= n; i++)
            System.out.printf("%.9f\n", rabbits[i]);
    }
}