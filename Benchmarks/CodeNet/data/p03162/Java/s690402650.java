import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] act = new int[N][3];
        
        for(int i=0; i<N; i++) {
            String[] input = br.readLine().split(" ");
            act[i][0] = Integer.parseInt(input[0]);
            act[i][1] = Integer.parseInt(input[1]);
            act[i][2] = Integer.parseInt(input[2]);
        }
        
        System.out.println(getMaxPoints(act));
    }

    private static int getMaxPoints(int[][] act) {
        int[][] cache = new int[act.length][3];
        
        for(int i=0; i<cache.length; i++) {
            Arrays.fill(cache[i], -1);
        }

        return getMaxPointsHelper(act, cache, 0, -1);
    }
    
    private static int getMaxPointsHelper(int[][] act, int[][] cache, int row, int col) {
        if(row == act.length) {
            return 0;
        }
        
        if(col != -1 && cache[row][col] != -1) {
            return cache[row][col];
        }
        
        int maxPoints = Integer.MIN_VALUE;
        
        for(int i=0; i<3; i++) {
            if(i == col) continue;
            maxPoints = Math.max(maxPoints, act[row][i] + getMaxPointsHelper(act, cache, row+1, i));
        }

        if(col == -1) {
            return maxPoints;
        }

        cache[row][col] = maxPoints;
        
        return cache[row][col];
    }
}