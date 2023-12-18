import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++) {
            points[i] = new Point(i);
        }
        
        boolean[] visited = new boolean[n];
        
        while (m-- > 0) {
            int me = sc.nextInt() - 1;
            int you = sc.nextInt() - 1;
            
            points[me].addFriend(points[you]);
            points[you].addFriend(points[me]);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            if (points[i].friends.size() != 1) continue;
            
            count++;
            int j = points[i].friends.get(0).name;
            
            while (true) {
                visited[j] = true;
                if (points[j].friends.size() != 2) break;
                
                count++;
                
                int tmp = points[j].friends.get(0).name;
                if (visited[tmp]) {
                    tmp = points[j].friends.get(1).name;
                }
                j = tmp;
                
            }
        }
        
        System.out.println(count);
    }
    
    public static class Point {
        int name;
        List<Point> friends;
        
        Point(int name) {
            this.name = name;
            this.friends = new ArrayList<Point>();
        }
        
        void addFriend(Point p) {
            this.friends.add(p);
        }
    }
}
