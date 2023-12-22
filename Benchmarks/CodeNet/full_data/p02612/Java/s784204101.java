import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        // スペース区切りの整数の入力
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // 文字列の入力
        // String s = sc.next();
        // 出力
        int o = N /1000;
        int ans = N - o *1000;
        System.out.println(ans);
    }
}