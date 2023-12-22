import java.util.*;
import java.awt.geom.*;

class Star{
    Point2D o;
    Point2D[] t;
    double a, r;

    Star(double x, double y, double a, double r){
        this.o = new Point2D.Double(x, y);
        this.a = a;
        this.r = r;

        t = new Point2D[5];

        for(int i = 0; i < 5; i++){
            double theta = (90 + a + 72 * i) % 360;
            theta = theta * Math.PI / 180;

            double dx = r * Math.cos(theta);
            double dy = r * Math.sin(theta);

            t[i] = new Point2D.Double(x + dx, y + dy);
        }
    }
}

public class Main{
    final static double INF = 999999999;

    static double distSS(Line2D la, Line2D lb){
        return
            Math.min(Math.min(la.ptSegDist(lb.getP1()), la.ptSegDist(lb.getP2())), 
                     Math.min(lb.ptSegDist(la.getP1()), lb.ptSegDist(la.getP2())));
    }

    static double calcDist(Star sa, Star sb){
        double res = INF;

        for(int i = 0; i < 5; i++){
            Line2D a = new Line2D.Double(sa.t[i], sa.t[(i + 2) % 5]);

            for(int j = 0; j < 5; j++){
                Line2D b = new Line2D.Double(sb.t[j], sb.t[(j + 2) % 5]);

                if(a.intersectsLine(b)){
                    return 0;
                }
                else{
                    res = Math.min(res, distSS(a, b));
                }
            }
        }

        return res;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true){
            int N = sc.nextInt();
            int M = sc.nextInt() - 1;
            int L = sc.nextInt() - 1;
            if(N == 0) break;

            Star[] t = new Star[N];

            for(int i = 0; i < N; i++){
                double x = sc.nextDouble();
                double y = sc.nextDouble();
                double a = sc.nextDouble();
                double r = sc.nextDouble();
                t[i] = new Star(x, y, a, r);
            }

            double[][] dist = new double[N][N];

            for(int i = 0; i < N; i++){
                for(int j = i; j < N; j++){
                    if(i == j) dist[i][j] = 0;
                    else       dist[i][j] = dist[j][i] = calcDist(t[i], t[j]);
                }
            }

            for(int k = 0; k < N; k++){
                for(int i = 0; i < N; i++){
                    for(int j = 0; j < N; j++){
                        if(i == j) continue;
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }

            System.out.printf("%.20f\n", dist[M][L]);
        }
    }
}