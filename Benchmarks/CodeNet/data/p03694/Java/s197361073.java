import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] loc = new int[N];
        for (int i = 0; i < N; i++) {
            loc[i] = sc.nextInt();
        }

        Arrays.sort(loc);

        int ans = loc[N - 1] - loc[0];

        System.out.println(ans);

    }

}