import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] monster = new long[N + 1];
        long[] hero = new long[N];
        long count = 0;
        for (int i = 0; i < N + 1; i++) {
            monster[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            hero[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (monster[i] >= hero[i]) {
                count += hero[i];
            } else if (monster[i] + monster[i + 1] >= hero[i]) {
                monster[i + 1] -= (hero[i] - monster[i]);
                count += hero[i];
            } else if (monster[i] + monster[i + 1] < hero[i]) {
                count += monster[i] + monster[i + 1];
            }
        }
        System.out.println(count);

    }

}
