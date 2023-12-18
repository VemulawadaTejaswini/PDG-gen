import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] a;
    static int[] b;
    static PriorityQueue<Pair> queue;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        a = new int[N];
        b = new int[N];
        queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            int cost = scanner.nextInt();
            int end = scanner.nextInt();
//            a[i] = cost;
//            b[i] = end;

            Pair p = new Pair(cost, end);
            queue.add(p);
        }
        scanner.close();
    }


    public static void main(String[] args) {
        init();


        int time = 0;
        boolean isFinished = true;
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            time += p.first;
            if(p.second < time) {
                isFinished = false;
                break;
            }
        }

        if(isFinished) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

class Pair implements Comparable<Pair> {
    long first;
    long second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }

    public long getSecond() {
        return second;
    }

    @Override
    public int compareTo(Pair p) {
        if(this.second < p.second) {
            return -1;
        } else if(this.second > p.second) {
            return 1;
        } else if(this.first > p.second) {
            return -1;
        } else if(this.first < p.second) {
            return 1;
        } else {
            return 0;
        }
    }

}