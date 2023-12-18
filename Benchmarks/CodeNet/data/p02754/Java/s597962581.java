import java.util.*;
public class Main {
	public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        // ボールの総数
        int n = sc.nextInt();

        // 末尾に加えた青いボールの数
        int a = sc.nextInt();

        // 末尾に加えた赤いボールの数
        int b = sc.nextInt();

        // 青いボールの総数
        int num = 0;

        if (a == 0) {

            num = 0;
        } else if (b == 0) {

            num = n;
        } else {

            num = n - b;
        }

        // 出力
        System.out.println(num);
    }
}