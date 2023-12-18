

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    private static class Battle {
        public Battle(int a, int b) {
            this.a = a;
            this.b = b;
        }

        int a;
        int b;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        PriorityQueue<Battle> queue = new PriorityQueue(new MyComparator());
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            queue.add(new Battle(a, b));
        }
        int answer = 1;
        int lastB = queue.poll().b;
        while (queue.size() > 0) {
            Battle battle = queue.poll();
            if (battle.a < lastB && lastB <= battle.b) {
                continue;
            } else {
                answer++;
                lastB = battle.b;
            }
        }

        System.out.println(answer);
    }

    static class MyComparator implements Comparator<Battle> {

        @Override
        public int compare(Battle o1, Battle o2) {
            if (o1.b < o2.b) {
                return -1;
            } else if (o1.b > o2.b) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}

