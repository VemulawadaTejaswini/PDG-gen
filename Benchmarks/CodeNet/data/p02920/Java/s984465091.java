
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    static class Slime {
        int health;
        int steps;

        public Slime(int health, int steps) {
            this.health = health;
            this.steps = steps;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] S = new int[(1 << N)];
        for (int i = 0; i < (1 << N); i++) S[i] = sc.nextInt();

        Arrays.sort(S);


        LinkedList<Slime> queue = new LinkedList<>();
        queue.addFirst(new Slime(S[S.length - 1], N));
        int next = S.length - 2;

        while (!queue.isEmpty()) {
            Slime slime = queue.pollLast();

            if (S[next] >= slime.health) {
                System.out.println("No");
                return;
            }

            for (int steps = slime.steps - 1; steps > 0; steps--) {
                queue.addFirst(new Slime(S[next], steps));
                next--;
            }
        }

        System.out.println("Yes");
    }
}
