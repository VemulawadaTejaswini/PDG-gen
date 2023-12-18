import java.util.*;
import java.awt.*;


 
class Main {
 
    private static Scanner sc = new Scanner(System.in);
 
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.next());
        ArrayList<Point> j = new ArrayList<Point>();
        for(int i = 0; i<n; i++){
            j.add(new Point(Integer.parseInt(sc.next()),
                Integer.parseInt(sc.next())));
        }
        String ans = "Yes";
        int nowTime = 0;        
        j.sort(Comparator.comparing(Point::getY)
        .thenComparing(Point::getX));
        for(Point p :j){
            nowTime += p.x;
            if(nowTime > p.y){
                ans = "No";
                break;
            }
        }
        System.out.println(ans);
    }


}