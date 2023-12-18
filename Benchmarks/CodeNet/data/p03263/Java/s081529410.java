import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] yx = br.readLine().split(" ");
        int y = Integer.parseInt(yx[0]);
        int x = Integer.parseInt(yx[1]);
        
        int[][] grid = new int[y][x];
        boolean[][] isEven = new boolean[y][x];
        
        for (int i = 0; i < y; i++) {
            String[] row = br.readLine().split(" ");
            for (int j = 0; j < x; j++) {
                grid[i][j] = Integer.parseInt(row[j]);
                if (grid[i][j] % 2 == 0) isEven[i][j] = true;
                else isEven[i][j] = false;
            }
        }
        
        int count = 0;
        String[] operations = new String[15000];
        int index = 0;
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (isEven[i][j]) continue;
                else {
                    if (i > 0){
                    if (!isEven[i-1][j]) {
                        count++;
                        operations[index] = i+" "+ j+" "+ (i-1) +" "+ j;
                        grid[i][j]--;
                        grid[i-1][j]++;
                        index++;
                        continue;
                    }
                    }
                    if (i < y-1){
                    if (!isEven[i+1][j]) {
                        count++;
                        operations[index] = i+" "+ j+" "+ (i+1)+" "+ j;
                        grid[i][j]--;
                        grid[i+1][j]++;
                        index++;
                        continue;
                    }
                    }
                    if (j > 0){
                    if (!isEven[i][j-1]) {
                        count++;
                        operations[index] = i+" "+ j+" "+ i+" "+ (j-1);
                        grid[i][j]--;
                        grid[i][j-1]++;
                        index++;
                        continue;
                    }
                    }
                    if (j < x-1){
                    if (!isEven[i][j+1]) {
                        count++;
                        operations[index] = i+" "+ j+" "+ i+" "+ (j+1);
                        grid[i][j]--;
                        grid[i][j+1]++;
                        index++;
                        continue;
                    }
                    }
                }
            }
        }
        
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(operations[i]);
        }
        
    }
}
