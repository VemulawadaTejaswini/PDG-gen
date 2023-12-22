import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    static class Point {
        int x=0;
        int y=0;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        while (true) {
            int n = s.nextInt();
            if(n==0) break;

            int m = s.nextInt();

            int count = 0;
            Point[] p = new Point[m];

            for (int j = 0; j < m; j++) {
                int x = s.nextInt();
                int y = s.nextInt();

                p[j] = new Point(x,y);
            }
            for (int i = 0; i < n; i++) {
                int m2 = s.nextInt();
                Point[] p2 = new Point[m2];

                for (int j = 0; j < m2; j++) {
                    int x = s.nextInt();
                    int y = s.nextInt();

                    p2[j]=new Point(x,y);
                }

                if (check(p, p2)) System.out.println(i+1);
                else {
                    reverse(p2);
                    if (check(p, p2)) System.out.println(i+1);
                }
            }
            System.out.println("+++++");
        }
    }
    public static boolean check(Point[] p, Point[] p2){
        int difx,dify;
        boolean flag;

        if(p.length!=p2.length) return false;

        for(int i=1;i<p2.length;i++){
            p[i].x-=p[0].x;
            p[i].y-=p[0].y;
            p2[i].x-=p2[0].x;
            p2[i].y-=p2[0].y;
        }
        p[0].x=0;
        p[0].y=0;
        p2[0].x=0;
        p2[0].y=0;

        flag=turnCheck(p,p2,0);

        return flag;
    }

    public static boolean turnCheck(Point[] p, Point[] p2,int num){
        boolean flag;
        if(num ==4) return false;

        if(p[1].x==p2[1].x && p[1].y==p2[1].y){
            for(int i=2;i<p.length;i++){
                if(!(p[i].x==p2[i].x && p[i].y==p2[i].y)){
                    return false;
                }
            }
            return true;
        } else {
            for (int i=1;i<p2.length;i++){
                int tempx=p2[i].x;
                int tempy=p2[i].y;
                p2[i].x=-tempy;
                p2[i].y=tempx;
            }
            flag=turnCheck(p,p2,num+1);
        }
        return flag;
    }

    public static final void reverse(Point[] arr) {
        final int len = arr.length;
        Point tmp;
        for (int i = 0; i < len / 2; i++) {
            tmp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = tmp;
        }
    }
}