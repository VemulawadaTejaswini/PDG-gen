import java.util.*;

class Main {

    static int[][] array = new int[10][10]; //先頭と末尾の組み合わせ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long ans = solve(N);
        System.out.println(ans);
    }

    static long solve(int N) {
        int ans = 0;
        for(int i=1; i<=N; i++) {
            count(i);
        }

        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                ans += array[i][j] * array[j][i];
            }
        }
        return ans;
    }

    static void count(int i){
        int a = i%10;
        int b = 0;
        while(i != 0) {
            b = i;
            i /= 10;
        }
        array[a][b]++;
    }
}
