import java.util.*;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int d = sc.nextInt();
        
        Map<Integer, Integer> x = new HashMap<>();
        Map<Integer, Integer> y = new HashMap<>();
        
        for(int i = 0; i < h; i++){
            for(int j = 0; j < w; j++){
                int xx = sc.nextInt();
                x.put(xx, i);
                y.put(xx, j);
            }
        }
        
        int q = sc.nextInt();
        int qx[] = new int[q];
        int qy[] = new int[q];
        
        for(int i = 0; i < q; i++){
            qx[i] = sc.nextInt();
            qy[i] = sc.nextInt();
        }
        
        for(int i = 0; i < q; i++){
            int total = 0;
            int pos = 0;
            int start = qx[i];
            while(qy[i] != start){
                int xVal = x.get(start + d) - x.get(start);
                int yVal = y.get(start + d) - y.get(start);
                xVal = xVal < 0 ? -xVal : xVal;
                yVal = yVal < 0 ? -yVal : yVal;
                total += xVal + yVal;
                start += d;
            }
            System.out.println(total);
        }
        
        
    }
}
