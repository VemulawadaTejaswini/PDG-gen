/**
 * Created by ysh on 2017/10/31.
 */
import java.util.Scanner;

public class Main{
    public static int[] dx = {-1,0,1,0};
    public static int[] dy = {0, 1, 0, -1};
    public static void solve(char[][] maze, int x, int y)
    {
        char temp = maze[x][y];
        maze[x][y] = '.';
        for (int i=0;i<4;i++)
        {
            int new_x = x+dx[i];
            int new_y = y+dy[i];
            if (new_x < 0 || new_x >= maze.length || new_y < 0 || new_y >= maze[0].length)
                continue;
            if(maze[new_x][new_y] == temp)
            {
                solve(maze, new_x, new_y);
            }
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x,y;
        while(true)
        {
            String l = sc.nextLine();
            String[] nums = l.split("\\s+");
            if(nums.length == 2 && nums[0].equals("0") && nums[1].equals("0"))
                return;
            int h = Integer.parseInt(nums[0]);
            int w = Integer.parseInt(nums[1]);
            char[][] maze = new char[h][w];
            for(int i = 0;i< h;i++)
            {
                String s = sc.nextLine();
                for(int j=0;j<w;j++)
                {
                    maze[i][j] = s.charAt(j);
                }
            }
            int res =0;
            for(int i=0;i<h;i++) {
                for (int j = 0; j < w; j++) {
                    if (maze[i][j] != '.')
                    {
                        solve(maze, i,j);
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}