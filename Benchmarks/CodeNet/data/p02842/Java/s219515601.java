import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    
    int n;

    public void run() {
        // 入力情報取得
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        // 解答処理
        int ans = solve((int)(n/1.08-5));
        if (ans != -1) {
            System.out.println(ans);
        } else {
            System.out.println(":(");
        }
    }
    
    private int solve(int a) {
        if ((int) (a * 1.08) == n) {
            return a;
        } else if(a <= n * 1.08){
            return solve(a + 1);
        } else {
            return -1;
        }
    }
}