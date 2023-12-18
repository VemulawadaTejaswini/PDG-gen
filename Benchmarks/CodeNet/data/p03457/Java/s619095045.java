import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        int[][] moves = new int[t][3];
        for(int i = 0; i < t; i++) {
            moves[i][0] = sc.nextInt();
            moves[i][1] = sc.nextInt();
            moves[i][2] = sc.nextInt();        
        }

        int[] rows = new int[] {-1, 1, 0, 0};
        int[] cols = new int[] { 0, 0,-1, 1};

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {0, 0});

        boolean found = false;
        int time = 0;
        int steps = 1;

        while(!queue.isEmpty() && time < t) {
            found = false;
            int size = queue.size();
            for(int j = 0; j < size; j++) {
                int[] pos = queue.poll();

                for(int k = 0; k < rows.length; k++) {
                    int nextX = pos[0] + rows[k];
                    int nextY = pos[1] + cols[k];
                    queue.offer(new int[]{nextX, nextY});

                    if(steps == moves[time][0] && moves[time][1] == nextX && moves[time][2] == nextY) {
                        queue.clear();
                        queue.offer(new int[]{nextX, nextY});
                        found = true;
                        break;
                    }
                }
                if(found) break; 
            }
            if(moves[time][0] == steps) {
                if(found) time++;
                else {
                    System.out.println("No");
                    return;
                }
            }
            steps++;
        }
        System.out.println("Yes");
    }
}
