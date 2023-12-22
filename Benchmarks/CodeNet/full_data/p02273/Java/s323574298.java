import java.util.*;
public class Main{
    public static void Koch(Point start, Point end, int level){
        if(level == 0){
            System.out.println(end.x + " " + end.y);
        }
        else{
                Point p1 = new Point((end.x-start.x)/3 + start.x,(end.y-start.y)/3 + start.y);
                Point p3 = new Point(2*(end.x - start.x)/3 + start.x, 2*(end.y-start.y)/3 + start.y);
                Point p2 = new Point((p1.x+p3.x)/2 - Math.sqrt(3)*(p3.y-p1.y)/2, Math.sqrt(3)*(p3.x-p1.x)/2+(p1.y+p3.y)/2);
                Koch(start,p1,level-1);
                Koch(p1,p2,level-1);
                Koch(p2,p3,level-1);
                Koch(p3,end,level-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point p1 = new Point(0,0);
        Point p2 = new Point(100,0);
        System.out.println(0 + " " + 0);
        Koch(p1,p2,n);
    }
}
class Point{
    double x;
    double y;
    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
}
