package aoj0118;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * author: Acrafter
 * date: 2017/1/11
 * time: 22:03
 */
public class Main{
    private static char[][] farm = new char[100][100];
    private static int[] dx = {1, -1, 0, 0}, dy = {0, 0, 1, -1};
    private static int result = 0;
    private static int H, W;
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        H = input.nextInt();W = input.nextInt();
        while (H != 0){
            for (int y = 0; y < H; y++) {
                char[] line = input.next().toCharArray();
                farm[y] = line;
            }
            for (int y = 0; y < H; y++) {
                for (int x = 0; x < W; x++) {
                    if(farm[y][x]!='W'){
                        dfs(y, x, farm[y][x]);
                        result += 1;
                    }
                }
            }
            System.out.println(result);
            result = 0;
            H = input.nextInt();W = input.nextInt();
        }
    }

    public static void dfs(int y, int x, char flag){
        farm[y][x] = 'W'; // ?????°??°???
        for(int i=0; i<4; i++){
            int ny = y + dy[i], nx = x + dx[i];
            if (0<=ny && ny<H && 0<=nx && nx<W && farm[ny][nx]==flag) {
                dfs(ny, nx, flag);
            }
        }
    }
}