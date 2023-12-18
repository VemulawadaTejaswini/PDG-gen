import java.util.*;

public class Main {
    static Point[] point;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        Point[] point = new Point[n];
    
        for (int i = 0; i < n; i++) {
            point[i] = new Point();
        }
        
        for (int i = 0; i < n - 1; i++) {
            int p = sc.nextInt() - 1;
            int q = sc.nextInt() - 1;
            
            point[p].children.add(q);
        }
        
        for (int i = 0; i < k; i++) {
            int p = sc.nextInt() - 1;
            int s = sc.nextInt();
            
            dfs(point, p, s);
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
    
    public static void dfs(Point[] point, int i, int s) {
        point[i].score += s;
        for (Integer child : point[i].children) {
            dfs(point, child, s);
        }
    }
}
