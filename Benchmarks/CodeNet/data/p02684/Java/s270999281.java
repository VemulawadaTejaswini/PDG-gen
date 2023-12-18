import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long K = sc.nextLong();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        int[] visit = new int[N];
        int i = 0;
        int next = 1;
        int roopStart = 0;
        while (true) {
            if (visit[next - 1] == 1) {
                roopStart = next;
                break;
            }
            visit[next - 1] = 1;
            next = A[next - 1];
            count++;
        }

        long step = (K - roopStart) % (long) count;

        int goal = A[roopStart - 1];
        for (int j = 0; j < step; j++) {
            goal = A[goal - 1];
        }

        System.out.println(goal);
    }
}