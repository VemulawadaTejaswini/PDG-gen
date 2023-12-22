import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        Pair[] pairsX = new Pair[n];
        Pair[] pairsY = new Pair[n];
        for (int i=0; i<n; i++) {
            int s = sc.nextInt();
            int t = sc.nextInt();
            Pair pair = new Pair(s, t);
            Pair pair2 = new Pair(t, s);
            pairsX[i] = pair;
            pairsY[i] = pair2;
        }

        Arrays.sort(pairsX);
        Arrays.sort(pairsY);

        int X = Math.abs(pairsX[0].x - pairsX[n-1].x) + Math.abs(pairsX[1].y - pairsX[n-1].y);
        int Y = Math.abs(pairsY[0].x - pairsY[n-1].x) + Math.abs(pairsY[1].y - pairsY[n-1].y);


        System.out.print(Math.max(X, Y));
    }

    class Pair implements Comparable<Pair>{
        int x;
        int y;
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int compareTo(Pair pair) {
            if (this.x == pair.x) {
                return this.y - pair.y;
            } else {
                return this.x - pair.x;
            }
        }
    }


}

