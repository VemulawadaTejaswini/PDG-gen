import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        int[] answer = new int[2 * N - 1];

        if (x == 1 || x == N) {
            System.out.println("No");
            return;
        }

        answer[N - 1] = x;
        for (int i = 0; i < answer.length; ++i) {
            if (i + 1 != x) {
                answer[i] = i + 1;
            }
        }

        System.out.println("Yes");
        for (int i = 0; i < answer.length; ++i) {
            System.out.println(answer[i]);
        }
        
    }
}