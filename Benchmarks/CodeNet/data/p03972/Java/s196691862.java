

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by yufeng.fyf on 16/10/10.
 */
public class Main {
    private static String temple = "CODEFESTIVAL2016";
    private static int MAX = 100000001;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        int h = input.nextInt();
        input.nextLine();
        int[] p = new int[w];
        int[] q = new int[h];
        boolean[][] visit = new boolean[w+1][h+1];
        for(int i=0;i<w;i++){
            p[i] = input.nextInt();
        }
        for(int i=0;i<h;i++){
            q[i] = input.nextInt();
        }
        int count=0;
        int all = (w+1)*(h+1);
        int allValue = 0;
        int i=0,j=0;
        Map<Point,Integer> nextPoints = new HashMap<>();
        visit[0][0] = true;
        nextPoints.put(new Point(0,1),q[0]);
        nextPoints.put(new Point(1,0),p[0]);
        while(count<all-1){
            int min = MAX;
            Point minPoint=null;
            for(Map.Entry<Point,Integer> entry:nextPoints.entrySet()){
                if(entry.getValue()<min){
                    minPoint = entry.getKey();
                    min = entry.getValue();
                }
            }
            i = minPoint.i;
            j = minPoint.j;
            visit[i][j] = true;
            if(i>0 && visit[i-1][j]==false){
                Point a = new Point(i-1,j);
                if(nextPoints.containsKey(a)&&nextPoints.get(a)<p[i-1]){
                    continue;
                }
                else{
                    nextPoints.put(a,p[i-1]);
                }
            }
            //右
            if(i<w && visit[i+1][j]==false){
                Point a = new Point(i+1,j);
                if(nextPoints.containsKey(a)&&nextPoints.get(a)<p[i]){
                    continue;
                }
                else{
                    nextPoints.put(a,p[i]);
                }
            }
            if(j>0&& visit[i][j-1]==false){
                Point a = new Point(i,j-1);
                if(nextPoints.containsKey(a)&&nextPoints.get(a)<q[j-1]){
                    continue;
                }
                else{
                    nextPoints.put(a,q[j-1]);
                }
            }
            if(j<h&& visit[i][j+1]==false){
                Point a = new Point(i,j+1);
                if(nextPoints.containsKey(a)&&nextPoints.get(a)<q[j]){
                    continue;
                }
                else{
                    nextPoints.put(a,q[j]);
                }
            }
            nextPoints.remove(minPoint);
            allValue += min;
            count++;
                System.out.println(i + " " + j);
        }
        System.out.println(allValue);
    }

}
class Point{
    public Point(int i, int j) {
        this.i = i;
        this.j = j;
    }
    int i;
    int j;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (i != point.i) return false;
        return j == point.j;

    }

    @Override
    public int hashCode() {
        int result = i;
        result = 31 * result + j;
        return result;
    }
}
