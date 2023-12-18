import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int goodTenbo = 0;

        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        int[] tenbo = new int[N];
        int[] hitenbo = new int[N];

        for (int i = 0; i < N; i++) {
            tenbo[i] = sc.nextInt();
        }
        sc.nextLine();

        for (int i = 1; i <= M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            hitenbo[a] = Math.max(hitenbo[a], tenbo[b]);
            hitenbo[b] = Math.max(hitenbo[b], tenbo[a]);
            sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            if (tenbo[i] > hitenbo[i]) {
                System.out.println(tenbo[i] + " " + hitenbo[i]);
                goodTenbo++;
            }
        }

        System.out.println(goodTenbo);
    }
}