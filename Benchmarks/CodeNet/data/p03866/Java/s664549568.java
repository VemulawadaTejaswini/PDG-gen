import java.util.*;

public class Main{
    
    static int[] x;
    static int[] y;
    static int[] r;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int sx = Integer.parseInt(sc.next());
        int sy = Integer.parseInt(sc.next());
        int gx = Integer.parseInt(sc.next());
        int gy = Integer.parseInt(sc.next());
        int n = Integer.parseInt(sc.next());
        x = new int[n+2];
        y = new int[n+2];
        r = new int[n+2];
        x[0] = sx;
        y[0] = sy;
        x[n+1] = gx;
        y[n+1] = gy;
        for(int i=0; i<n; i++){
            x[i+1] = Integer.parseInt(sc.next());
            y[i+1] = Integer.parseInt(sc.next());
            r[i+1] = Integer.parseInt(sc.next());
        }
        
        double[][] dist = new double[n+2][n+2];
        for(int i=0; i<n+2; i++){
            for(int j=0; j<n+2; j++){
                long difx = Math.abs(x[i]-x[j]);
                long dify = Math.abs(y[i]-y[j]);
                double dis = Math.sqrt(difx*difx + dify*dify);
                double cost = Math.max(0, dis-(r[i]+r[j]));
                dist[i][j] = cost;
            }
        }
        
        for(int k=0; k<n+2; k++){
            for(int i=0; i<n+2; i++){
                for(int j=0; j<n+2; j++){
                    if(dist[i][j] > dist[i][k]+dist[k][j]){
                        dist[i][j] = dist[i][k]+dist[k][j];
                    }
                }
            }
        }
        
        System.out.println(dist[0][n+1]);
        
    }
}
