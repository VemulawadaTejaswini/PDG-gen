import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int LMax = 0;
        int RMin = N;

        for (int i = 0; i < M; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            LMax = L >= LMax ? L : LMax;
            RMin = R <= RMin ? R : RMin;
        }
        sc.close();

        if (LMax > RMin) {
            System.out.println(0);
        } else {
            System.out.println(RMin - LMax + 1);
        }

    }
}
