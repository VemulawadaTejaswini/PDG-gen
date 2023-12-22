
import java.util.Scanner;

/**
 * author: Acrafter
 * date: 2017/1/15
 * time: 16:04
 */
public class Main{
    private static int left = -1, right = -1;
    private static int[] balls = new int[10];
    private static String result = "NO";
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        balls = new int[10];
        for (int i = 0; i < m; i++) {
            for (int i2 = 0; i2 < 10; i2++) {
                balls[i2] = input.nextInt();
            }
            left = -1; right = -1;
            result = "NO";
            dfs(0);
            System.out.println(result);
        }
    }

    public static void dfs(int i){
        if(i==10){
            result = "YES";
            return;
        }
        if (left<balls[i]){
            left = balls[i];
            dfs(i+1);
        }else if(right<balls[i]) {
            right = balls[i];
            dfs(i+1);
        }
    }
}