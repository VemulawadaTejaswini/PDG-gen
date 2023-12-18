import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Queue;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();

        char[][] grid = new char[h][w];

        for (int i=0; i<h; i++){
            String s = sc.next();
            grid[i] = s.toCharArray();
        }

        long ans = 0;

        Queue<int[]> q = new ArrayDeque();

        int[] arr = {0, 0, 0};

        for (int i=0; i<h; i++){
            for (int j=0; j<w; j++){
                if (grid[i][j]=='#'){
                    arr[0] = i;
                    arr[1] = j;
                    arr[2] = 0;
                    q.add(arr);
                }
            }
        }
//        System.out.println(q.size());

        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!q.isEmpty()){
            int[] tmp = q.poll();
            int y = tmp[0];
            int x = tmp[1];
            int cnt = tmp[2];
            for (int i=0; i<4; i++){
                if (0<=y+dy[i] && y+dy[i]<=h-1 && 0<=x+dx[i] && x+dx[i]<=w-1){
                    if (grid[y+dy[i]][x+dx[i]]=='.'){
                        grid[y+dy[i]][x+dx[i]]='#';
                        int[] add = {y+dy[i], x+dx[i], cnt++};
                        q.add(add);
                        ans = cnt;
                    }
                }
            }
        }
        System.out.println(ans);


    }
}