import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        int K = scan.nextInt();
        char[][] maze = new char[H][W];
        int startWidth = 0, startHeight = 0;
        
        String mazeValue;
        char[] splitMazeValue = new char[W];

        int[][] mazeCost = new int[H][W];
        
        //迷路作成
        for(int i = 0; i < H; i++) {
            mazeValue = scan.next();
            splitMazeValue = mazeValue.toCharArray();
            for(int j = 0; j < W; j++) {
                maze[i][j] = splitMazeValue[j];
                if(maze[i][j] == 'S') {
                    startHeight = i;
                    startWidth = j;
                }
                mazeCost[i][j] = 0;
            }
        }
        
        
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(maze[i][j] != 'S') {
                    //歩数カウント
                    int distance = Math.abs(i - startHeight) + Math.abs(j - startWidth);
                    System.out.println("debug1: " + Math.abs(i - startHeight) + " " + Math.abs(j - startWidth));
                    
                    int steps = distance / K + 1;
                    if(distance / K != 0 && distance % K != 0) steps++;
                    mazeCost[i][j] = steps;
                    
                    System.out.println("debug2: " + steps);
                
                    //魔法カウント
                    if(maze[i][j] == '#') {
                        mazeCost[i][j] += steps;
                    }
                }
            }
        }
        
        //デバッグ
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                System.out.print(mazeCost[i][j]);
            }
            System.out.println();
        }
        
        //回答作成
        int answer = Integer.MAX_VALUE;
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(i == 0 || i == H - 1 || j == 0 || j == W - 1) {
                    if(mazeCost[i][j] < answer) {
                        answer = mazeCost[i][j];
                    }
                }
            }
        }
        System.out.println(answer);
    }
}
