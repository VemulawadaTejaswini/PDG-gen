import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            if (n == 0 && m == 0 && a == 0) {
                break;
            }
            int[] selections = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                selections[i] = i;
            }
            PriorityQueue<Line> lines = new PriorityQueue<>();
            for (int i = 0; i < m; i++) {
                lines.add(new Line(sc.nextInt(), sc.nextInt(), sc.nextInt()));
            }
            while (lines.size() > 0) {
                Line l = lines.poll();
                int tmp = selections[l.left];
                selections[l.left] = selections[l.right];
                selections[l.right] = tmp;
            }
            sb.append(selections[a]).append("\n");
        }
        System.out.print(sb);
    }
    
    static class Line implements Comparable<Line> {
        int height;
        int left;
        int right;
        
        public Line (int height, int left, int right) {
            this.height = height;
            this.left = left;
            this.right = right;
        }
        
        public int compareTo(Line another) {
            return height - another.height;
        }
    }
}

