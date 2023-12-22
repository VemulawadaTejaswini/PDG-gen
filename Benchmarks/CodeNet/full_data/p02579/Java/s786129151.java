
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int ans = Integer.MAX_VALUE;
    static char[][]maze;
    static int[]X = new int[]{0,1,0,-1};
    static int[]Y = new int[]{1,0,-1,0};
    static boolean[][]find;
    static int h,w,c1,c2,d1,d2;
    static boolean findAns = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        w = sc.nextInt();
        c1 = sc.nextInt();
        c2 = sc.nextInt();
        d1 = sc.nextInt();
        d2 = sc.nextInt();
        maze = new char[h][w];
        find = new boolean[h][w];
        for(int i = 0;i < maze.length;i++){
                String a = sc.next();
                maze[i] = a.toCharArray();
        }
        LinkedList<int[]> stack = new LinkedList<>();
        dfs(c1,c2,stack,0);
        int count = 1;
        while (!stack.isEmpty() && ans == Integer.MAX_VALUE){
            int size = stack.size();
            for (int z = 0; z < size; z++) {
                int[] pop = stack.pollFirst();
                if(pop[0] >= 0 && pop[0] < maze.length && pop[1] >= 0 && pop[1] < maze[0].length){
                    int newX = pop[0] - 2;
                    int newY = pop[1] - 2;
                    for(int i = newX;i < newX + 5;i++){
                        for(int j = newY;j < newY + 5;j++){
                            if(i >= 0 && i < maze.length && j >= 0 && j < maze[0].length){
                                if(!find[i][j] && maze[i][j] != '#'){
                                    dfs(i,j,stack,count);
                                }
                            }
                        }
                    }
                }
            }
            count++;
        }
        if(ans == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(ans);
    }
    private static void dfs(int beg,int end,LinkedList<int[]>queue,int count){
        if(!(beg >= 0 && beg < maze.length && end >= 0 && end < maze[0].length)){
            return;
        }
        if(find[beg][end] || maze[beg][end] == '#')
            return;
        find[beg][end] = true;
        if(beg == d1 - 1 && end == d2 - 1){
            ans = Math.min(count,ans);
            findAns = true;
        }
        queue.addLast(new int[]{beg,end});
        for(int i = 0;i < 4;i++){
            int newX = beg + X[i];
            int newY = end + Y[i];
            dfs(newX,newY,queue,count);
        }
    }
}
