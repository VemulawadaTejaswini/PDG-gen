import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[n];
        int[] h = new int[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
            h[i] = Integer.parseInt(sc.next());
        }
        
        int xt = 0;
        int yt = 0;
        int ht = 0;
        for(int i = 0; i < n; i++){
            if(h[i] > 0){
                xt = x[i];
                yt = y[i];
                ht = h[i];
                break;
            }
        }
        
        for(int cy = 0 ; cy <= 100; cy++){
            for(int cx = 0; cx <= 100; cx++){
                int height = ht + Math.abs(cx-xt) + Math.abs(cy-yt);
                boolean stop = true;
                for(int i = 0; i < n; i++){
                    if(h[i] != Math.max(height - Math.abs(x[i]-cx) - Math.abs(y[i]-cy), 0)){
                        stop = false;
                        break;
                    }
                }
                if(stop){
                    System.out.println(cx + " " + cy + " " + height);
                    return;
                }
            }
        }
    }
}