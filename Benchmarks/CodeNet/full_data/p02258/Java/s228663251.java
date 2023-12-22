import java.util.Scanner;


public class Main {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //入力の個数

        int minv = scanner.nextInt(); //1個目の値(以前r[0]に入れていたもの)
        int maxv = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            int rt = scanner.nextInt();

            // 最大値の更新
            maxv = Math.max(maxv, rt - minv);


            
            // 最小値の更新
            minv = Math.min(minv, rt);

        }
        System.out.println(maxv);
    }
}

