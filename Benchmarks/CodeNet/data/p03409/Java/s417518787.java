
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + this.x + ", " + this.y + ")";
        }

    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] aArr = new Point[n];
        Point[] bArr = new Point[n];
        for (int i = 0; i < n; i ++) {
            aArr[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < n; i ++) {
            bArr[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(aArr, (o1, o2) -> o1.x - o2.x);
        Arrays.sort(bArr, (o1, o2) -> o1.x - o2.x);
        int count = 0;
        int currentIdx = 0;
        for (Point a : aArr) {
            for (;currentIdx < n; currentIdx++) {
//                debug(currentIdx);
                Point b = bArr[currentIdx];
//                debug(currentIdx, a, b);
                if (a.x < b.x && a.y < b.y) {
                    count++;
                    currentIdx++;
                    break;
                }
            }
        }

        Arrays.sort(aArr, (o1, o2) -> o1.y - o2.y);
        Arrays.sort(bArr, (o1, o2) -> o1.y - o2.y);
        int count2 = 0;
        int currentIdx2 = 0;
        for (Point a : aArr) {
            for (;currentIdx2 < n; currentIdx2++) {
//                debug(currentIdx2);
                Point b = bArr[currentIdx2];
//                debug(currentIdx2, a, b);
                if (a.x < b.x && a.y < b.y) {
                    count2++;
                    currentIdx2++;
                    break;
                }
            }
        }

//        System.out.println(count);
//        System.out.println(count2);
        System.out.println(Math.max(count, count2));

    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
