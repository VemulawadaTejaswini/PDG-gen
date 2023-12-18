import java.util.*;


class Com implements Comparator<Point>{
    public int compare(Point a,Point b){
        int c = a.c.compareTo(b.c);
        if (c==0){
            return b.p-a.p;
        }
        return c;
    }
}
class Point{
    String c;
    int p;
    int in;
    Point(String a,int b,int d){
        c = a;
        p = b;
        in = d;
    }
}
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        TreeSet<Point> list = new TreeSet<>(new Com());
        for (int i=0;i<N;i++){
            String name = scan.next();
            int point = scan.nextInt();
            list.add(new Point(name,point,i+1));
        }
        Object[] arr = list.toArray();
        for (int i=0;i<arr.length;i++){
            Point as = (Point)arr[i];
            System.out.println(as.in);
        }
    }
}
