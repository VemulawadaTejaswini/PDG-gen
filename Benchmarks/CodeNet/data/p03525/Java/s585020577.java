import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            D[i] = sc.nextInt();
        }
        Arrays.sort(D);

        int[] T = new int[N+2];
        T[0] = 0;
        T[N+1] = 24;
        for (int i = 1; i <= N; i++) {
            T[i] = i%2 == 1 ? D[i-1] : 24-D[i-1];
        }
        Arrays.sort(T);

        int min = 24;
        for (int i = 0; i < N+1; i++) {
            min = Math.min(min,T[i+1]-T[i]);
        }

        System.out.println(min);
    }
}
