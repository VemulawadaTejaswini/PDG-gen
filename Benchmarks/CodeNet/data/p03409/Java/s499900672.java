import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    class Pair {
        int y, x;
        Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
    void run() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Queue<Pair> queab = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.y - p2.y != 0) {
                    return p1.y - p2.y;
                } else {
                    return p1.x - p2.x;
                }
            }
        });
        for (int i = 0; i < n; i++)
            queab.add(new Pair(scan.nextInt(), scan.nextInt()));
        Queue<Pair> quecd = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.y - p2.y != 0) {
                    return p1.y - p2.y;
                } else {
                    return p1.x - p2.x;
                }
            }
        });
        Queue<Pair> tmp = new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair p1, Pair p2) {
                if (p1.y - p2.y != 0) {
                    return p1.y - p2.y;
                } else {
                    return p1.x - p2.x;
                }
            }
        });
        for (int i = 0; i < n; i++)
            quecd.add(new Pair(scan.nextInt(), scan.nextInt()));
        int ans = 0;
        while(!queab.isEmpty()) {
            Pair p1 = queab.poll();
            while(!quecd.isEmpty()) {
                Pair p2 = quecd.poll(); 
                if (p1.y < p2.y && p1.x < p2.x) {
                    ans++;
                    break;
                } else {
                    tmp.add(p2);
                }
            }
            while(!tmp.isEmpty())
                quecd.add(tmp.poll());
        }
        System.out.println(ans);
   }
    public static void main(String[] args) {
        new Main().run();
    }
}
