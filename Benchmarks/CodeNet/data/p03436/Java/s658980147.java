import java.util.Scanner;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        String s[] = new String[H];
        char S[][] = new char[H][W];
        int white = 0;
        boolean check[][] = new boolean[H+2][W+2];
        for (int i = 0; i < H; i++) {
            s[i] = sc.next();
        }
        for (int i = 0; i < H; i++) {
            S[i] = s[i].toCharArray();
        }
        
        for (int i = 1; i <=H; i++) {
            for (int j = 1; j <=W; j++) {
                if (S[i-1][j-1] == '.') {
                    check[i][j] = true;
                    white++;
                }
            }
        }
        boolean dp[][]=new boolean[H+2][W+2];
        dp[1][1]=true;
        for(int t=1;t<H*W;t++){
            boolean next[][]=new boolean[H+2][W+2];
        for(int i=1;i<=H;i++){
            for(int j=1;j<=W;j++){
                next[i][j]=check[i][j]&&(dp[i-1][j]||dp[i][j-1]||dp[i][j+1]||dp[i+1][j]);
            }
        }
        if(next[H][W]==true){
            System.out.println(white-t-1);
            return;
        }
        dp=next;
        }
        System.out.println("-1");

    }
}