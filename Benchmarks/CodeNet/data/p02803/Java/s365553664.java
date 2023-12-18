import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        
        int[][] maze = new int[h+2][w+2];
        for(int i = 1; i <= h; i++){
            String s = sc.next();
            for(int j = 1; j <= w; j++){
                if(s.charAt(j-1) == '.'){
                    maze[i][j] = 1;
                }
            }
        }
        
        int max = 0;
        for(int i = 1; i <= h; i++){
            for(int j = 1; j <= w; j++){
                int[][] dist = new int[h+2][w+2];
                for(int k = 1; k <= h; k++){
                    Arrays.fill(dist[k], -1);
                }
                ArrayDeque<Integer> queue = new ArrayDeque();
                dist[i][j] = 0;
                queue.add(i*100 + j);
                while(!queue.isEmpty()){
                    int u = queue.poll();
                    int y = u/100;
                    int x = u%100;
                    if(maze[y-1][x] == 1 && dist[y-1][x] == -1){
                        dist[y-1][x] = dist[y][x] +1;
                        if(dist[y-1][x] > max) max = dist[y-1][x];
                        queue.add((y-1)*100 + x);
                    }
                    if(maze[y+1][x] == 1 && dist[y+1][x] == -1){
                        dist[y+1][x] = dist[y][x] +1;
                        if(dist[y+1][x] > max) max = dist[y+1][x];
                        queue.add((y+1)*100 + x);
                    }
                    if(maze[y][x-1] == 1 && dist[y][x-1] == -1){
                        dist[y][x-1] = dist[y][x] +1;
                        if(dist[y][x-1] > max) max = dist[y][x-1];
                        queue.add(y*100 + x-1);
                    }
                    if(maze[y][x+1] == 1 && dist[y][x+1] == -1){
                        dist[y][x+1] = dist[y][x] +1;
                        if(dist[y][x+1] > max) max = dist[y][x+1];
                        queue.add(y*100 + x+1);
                    }
                }
            }
        }
        
        System.out.println(max);
    }
}