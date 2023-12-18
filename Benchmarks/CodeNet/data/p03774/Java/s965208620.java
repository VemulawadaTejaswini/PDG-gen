import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            solve(sc);
        }
    }

    public static void solve(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] students = new Point[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        Point[] checkPoints = new Point[m];
        for (int i = 0; i < m; i++) {
            checkPoints[i] = new Point(sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int minIndex = 0;
            int minManhattan = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                int manhattan = Math.abs(students[i].x - checkPoints[j].x) + Math.abs(students[i].y - checkPoints[j].y);
                if (manhattan < minManhattan) {
                    minManhattan = manhattan;
                    minIndex = j;
                }
            }
            System.out.println(minIndex +1);
        }
    }

    static class Point {
        int x;
        int y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}