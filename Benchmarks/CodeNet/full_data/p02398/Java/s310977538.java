import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //３つの整数 a、b、c を読み込み、
        //a から b までの整数の中に、c の約数がいくつあるかを求めるプログラムを作成してください
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int y = 0, x;
        for (x = a; x <= b; x++){
            if (c % x == 0) {
                y += 1;
            }
             
        }
        System.out.println(y);
    }
}
