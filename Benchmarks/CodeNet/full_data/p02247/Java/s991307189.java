import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge {
    int to;
    int cost;

    Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }
}

class Pair implements Comparable<Pair> {
    int dist;
    int index;

    Pair(int dist, int index) {
        this.dist = dist;
        this.index = index;
    }

    public int compareTo(Pair p2) {
        return dist - p2.dist;
    }
}
 
public class Main {
    static final int INF = 2000000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String t = sc.next();
        String p = sc.next();

        for(int i = 0; i <= t.length() - p.length(); i++) {
            if(t.substring(i, i + p.length()).equals(p)) {
                System.out.println(i);
            }
        }
 
        sc.close();
    }
}
