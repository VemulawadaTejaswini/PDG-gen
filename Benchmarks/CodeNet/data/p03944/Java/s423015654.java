import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] whn = br.readLine().split(" ");
        int w = Integer.parseInt(whn[0]);
        int h = Integer.parseInt(whn[1]);
        int n = Integer.parseInt(whn[2]);
        boolean[][] shikaku = new boolean[w][h];
        String[] line;
        int x, y, a;
        
        /*
        a i = 1 のときは長方形の x < x i をみたす領域
        a i = 2 のときは長方形の x > x i をみたす領域
        a i = 3 のときは長方形の y < y i をみたす領域 
        a i = 4 のときは長方形の y > y i をみたす領域
        */
        
        for (int i = 0; i < n; i++) {
            line = br.readLine().split(" ");
            x = Integer.parseInt(line[0]);
            y = Integer.parseInt(line[1]);
            a = Integer.parseInt(line[2]);
            
            if (a == 1) {
                for (int j = 0; j < x; j++) {
                    for (int k = 0; k < h; k++) {
                        shikaku[j][k] = true;
                    }
                }
            }
            
            if (a == 2) {
                for (int j = x; j < w; j++) {
                    for (int k = 0; k < h; k++) {
                        shikaku[j][k] = true;
                    }
                }
            }
            
            if (a == 3) {
                for (int j = 0; j < w; j++) {
                    for (int k = 0; k < y; k++) {
                        shikaku[j][k] = true;
                    }
                }
            }
            
            if (a == 4) {
                for (int j = 0; j < w; j++) {
                    for (int k = y; k < h; k++) {
                        shikaku[j][k] = true;
                    }
                }
            }
        }
        
        int ans = 0;
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                if (shikaku[i][j] == false) ans++; 
            }
        }
        
        System.out.println(ans);
    }
}
