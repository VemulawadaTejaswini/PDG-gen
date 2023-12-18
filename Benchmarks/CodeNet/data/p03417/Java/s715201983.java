import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        final int M = sc.nextInt();
    	
        boolean[][] map = new boolean[N][M];
        
        for (int i = 0; i < N; i++) {
        	for (int j = 0; j < M; j++) {
        		map[i][j] = !map[i][j];//中心
        		
        		if (j > 0) {//左
            		map[i][j - 1] = !map[i][j - 1];
        		}
        		
        		if (j < M - 1) {//右
            		map[i][j + 1] = !map[i][j + 1];
        		}
        		
        		
        		if (i < N - 1) {//下
            		map[i + 1][j] = !map[i + 1][j];
        		}
        		if (i < N - 1 && j > 0) {//左下
            		map[i + 1][j - 1] = !map[i + 1][j - 1];
        		}
        		if (i < N - 1 && j < M - 1) {//右下
            		map[i + 1][j + 1] = !map[i + 1][j + 1];
        		}


        		if (i > 0) {//上
        			map[i - 1][j] = !map[i - 1][j];
        		} 
        		if (i > 0 && j > 0) {// 左上
            		map[i - 1][j - 1] = !map[i - 1][j - 1];
        		}
        		if (i > 0 && j < M - 1) {//右上
            		map[i - 1][j + 1] = !map[i - 1][j + 1];
        		}
        		
        	}
        }
        
        int ans = 0;
        for (int n = 0; n < N; n++) {
        	for (int m = 0; m < M; m++) {
        		if (map[n][m]) ans++;
        	}
        }
        
        System.out.println(ans);
    }
    
}