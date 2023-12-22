import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String o="";
        int n=sc.nextInt();
        int m=sc.nextInt();
        Point[] points=new Point[n];
        for(int i=0;i<n;i++){
            points[i]=new Point(i);
        }
        
        for(int i=0;i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            points[a-1].add(b-1);
            points[b-1].add(a-1);
        }
        ArrayList<Point> pointlist=new ArrayList<>();
        pointlist.add(points[0]);
        points[0].mark=0;
        while(!pointlist.isEmpty()){
            Point point=pointlist.remove(0);
            ArrayList<Integer> list=point.list;
            while(!list.isEmpty()){
                int ind=list.remove(0);
                if(points[ind].mark==Integer.MAX_VALUE){
                    pointlist.add(points[ind]);
                    points[ind].mark=point.ind;
                }
            }
        }

        int[] ma=new int[n];
        for(int i=0;i<n;i++){
            if(points[i].mark==Integer.MAX_VALUE){
                System.out.println("No");
                return;
            }else{
                ma[i]=points[i].mark+1;
            }
            if(i==n-1)o="Yes";
        }
      System.out.println(o);
      for(int i=1;i<n;i++){
        System.out.println(ma[i]);
      }
    }
    
}

class Point{
    public int mark;
    public int ind ;
    public ArrayList<Integer> list;
    public Point(int ind){
        mark=Integer.MAX_VALUE;
        list=new ArrayList<>();
        this.ind=ind;
    }

    void add(int a){
        list.add(a);
    }
}
