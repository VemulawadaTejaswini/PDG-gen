import java.util.*;

public class Main {
    static Point[] point;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] alreadyAppeared = new int[n];
        
        Point[] point = new Point[n];
        for (int i = 0; i < n; i++) {
            point[i] = new Point();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            
            if (p == 0 || alreadyAppeared[p] == 1) {
                point[p].children.add(q);
            } else {
                point[q].children.add(p);
            }
            alreadyAppeared[p] = 1;
            alreadyAppeared[q] = 1;
        }
        
        while (k-- > 0) {
            int p = sc.nextInt() - 1;
            int s = sc.nextInt();
            
            point[p].score += s;
        }
        
        for (int i = 0; i < n; i++) {
            int me = i;
            for (Integer child : point[me].children) {
                point[child].score += point[me].score;
            }
        }
        
        for (Point p : point) {
            System.out.println(p.score);
        }
    }
    
    public static class Point {
        int score;
        List<Integer> children;
        
        Point() {
            this.children = new ArrayList<Integer>();
        }
    }
}
