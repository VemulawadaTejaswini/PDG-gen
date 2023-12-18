import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        MyPoint[] p1 = new MyPoint[n];
        MyPoint[] p2 = new MyPoint[n];

        for(int i = 0; i<n; i++) {
            p1[i] = new MyPoint(sc.nextInt(), sc.nextInt());
        }
        for(int i = 0; i<n; i++) {
            p2[i] = new MyPoint(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(p1,(ac, bc)->(ac.x - bc.x));
        Arrays.sort(p2,(ac, bc)->(ac.x - bc.x));

        int cnt = 0;
        for(int i = 0; i<n; i++) {
            int maxYIndex = 0;
            int maxY = 0;
            boolean f = false;
            MyPoint p = p2[i];
            for(int j = 0; j<n; j++) {
                if(p1[j].x<p.x && p1[j].y<p.y) {
                    f = true;
                    if(maxY < p1[j].y) {
                        maxY = p1[j].y;
                        maxYIndex = j;
                    }
                }
            }
            if(f) {
                p1[maxYIndex].x = 101;
                p1[maxYIndex].y = 101;
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
class MyPoint {
    int x, y;
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}