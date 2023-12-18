import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        // 入力
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int X = scan.nextInt();

        // 出力
        System.out.println((double)T / X);
    }
}