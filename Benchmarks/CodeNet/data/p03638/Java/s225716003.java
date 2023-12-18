import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();
        int N = sc.nextInt();
        int[] a = new int[N + 1];
        for(int i = 1; i <= N; i++){
            int v = sc.nextInt();
            a[i] = v;
        }

        int[][] ans = new int[H][W];
        int curr = 1;
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                ans[i][i % 2 == 0 ? j : W - 1 - j] = curr;
                a[curr] -= 1;
                if(a[curr] == 0){
                    curr += 1;
                }
            }
        }

        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                System.out.print(String.format("%d ", ans[i][j]));
            }
            System.out.println();
        }

    }
}