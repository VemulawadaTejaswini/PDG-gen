import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    public static Point[] point;
    //public static StringBuilder sb = new StringBuilder();                         
    public static int n;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        point = new Point[n];
        for(int i = 0; i < n; i++){
            String[] t = br.readLine().split(" ");
            int x = Integer.parseInt(t[0]);
            int y = Integer.parseInt(t[1]);
            point[i] = new Point(x, y);
        }
        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i < q; i++){
            String[] t = br.readLine().split(" ");
            int sx = Integer.parseInt(t[0]);
            int tx = Integer.parseInt(t[1]);
            int sy = Integer.parseInt(t[2]);
            int ty = Integer.parseInt(t[3]);
            findPoint(sx, tx, sy, ty);
        }
    }

    public static void findPoint(int sx, int  tx, int sy, int ty){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){//is point[i] inside?                            
            if(sx <= point[i].x && point[i].x <= tx
               && sy <= point[i].y && point[i].y <= ty){
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
        sb.delete(0, sb.length()-1);
    }

}


class Point{
    int x, y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}