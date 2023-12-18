import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[] x = new int[h * w + 1];
        int[] y = new int[h * w + 1];
        int[] cost = new int[h*w + 1];
        
        int d = sc.nextInt();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int in = sc.nextInt();
                x[in] = i + 1;
                y[in] = j + 1;
            }
        }
        
        for (int i = d+1; i <= h*w; i++) {
            cost[i] = cost[i-d] + Math.abs(x[i] - x[i-d]) + Math.abs(y[i] - y[i-d]);
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int xIn = sc.nextInt();
            int r = sc.nextInt();
            
            System.out.println(cost[r] - cost[xIn]);
        }
    }
}