import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        long[] h = new long[N];
        for(int i = 0; i < N;i++){
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            h[i] = sc.nextLong();
        }
        long[][] height = new long[101][101];
        long[][] height1 = new long[101][101];
        long[][][] height2 = new long[101][101][101];
        boolean[][] han = new boolean[101][101];
        int Cx = -1;
        int Cy = -1;
        long H = 0;
        if(N == 1){
            H = h[0];
            Cx = x[0];
            Cy = y[0];
        }else{
            for(int i = 0; i <= 100; i++){
                for(int j = 0; j <= 100; j++){
                    if(h[0] + x[0] + y[0]  - i - j > 0){
                        height[i][j] = h[0] + Math.abs(x[0] - i) + Math.abs(y[0] - j);
                    }
                    if(h[1] + x[1] + y[1]  - i - j > 0){
                        height1[i][j] = h[1] + Math.abs(x[1] - i) + Math.abs(y[1] - j);
                    }
                    if(height[i][j] == height1[i][j]){
                        han[i][j] = true;
                    }else{
                        han[i][j] = false;
                    }
                }
            }
            if(N == 2){
                for(int i = 0; i <= 100; i++){
                    for(int j = 0; j <= 100; j++){
                        if(han[i][j]){
                            if(H <= height[i][j]){
                                H = height[i][j];
                                Cx = i;
                                Cy = j;
                            }
                        }
                    }
                }
            }else{
                for(int k = 2; k < N; k++){
                    for(int i = 0; i <= 100; i++){
                        for(int j = 0; j <= 100; j++){
                            if(han[i][j]){
                                if(h[k] + x[k] + y[k]  - i - j > 0){
                                    height2[k][i][j] = h[k] + Math.abs(x[k] - i) + Math.abs(y[k] - j);
                                }
                                if(height[i][j] == height2[k][i][j]){
                                    han[i][j] = true;
                                }else{
                                    han[i][j] = false;
                                }
                                
                            }
                        }
                    }
                }
                for(int i = 0; i <= 100; i++){
                    for(int j = 0; j <= 100; j++){
                        if(han[i][j]){
                            if(H < height[i][j]){
                                H = height[i][j];
                                Cx = i;
                                Cy = j;
                            }
                        }
                    }
                }
            }
        }
       System.out.println(Cx + " " + Cy + " " + H); 
    }
}
