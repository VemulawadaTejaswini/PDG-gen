import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class Point{
    int x, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){return x;}
    public int getY(){return y;}

    public boolean equals(Object a) {
        if(a instanceof Point) {
            Point A = (Point)a;
            return this.x==A.getX() && this.y==A.getY();
        }else return false;
    }
    public int hashCode(){
        return x * 30011 + y;
    }
}

public class Main {
    static int maxValue(int[] a){
        int m = a[0];
        for(int i=1; i<a.length; i++) m = Math.max(m, a[i]);
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int M = sc.nextInt();
        Set<Point> bombs = new HashSet<>();

        int[] bombH = new int[H];
        int[] bombW = new int[W];

        for(int m=0; m<M; m++){
            int hm = sc.nextInt()-1;
            int wm = sc.nextInt()-1;
            bombH[hm]++;
            bombW[wm]++;
            bombs.add(new Point(hm,wm));
        }

        int bh = maxValue(bombH);
        int bw = maxValue(bombW);

        Set<Integer> mostH = new HashSet<>(), lessH = new HashSet<>();
        Set<Integer> mostW = new HashSet<>(), lessW = new HashSet<>();

        for(int h=0; h<H; h++){
            if(bombH[h]==bh) mostH.add(h);
            else if(bombH[h]==bh-1) lessH.add(h);            
        }
        for(int w=0; w<W; w++){
            if(bombW[w]==bw) mostW.add(w);
            else if(bombW[w]==bw-1) lessW.add(w);      
        }
        
        int ans = bh+bw-1;

        for(int h:mostH) for(int w:mostW){
            if(ans >= bh+bw || !bombs.contains(new Point(h,w))){
                ans = bh+bw;
                break;
            }
        }

        System.out.println(ans);
    }
}
