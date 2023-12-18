import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int l = sc.nextInt() % 2019;
        // スペース区切りの整数の入力
        int r = sc.nextInt() % 2019;
        int answer = 2018;
        // for文
        for(int i = l; i < r; i++){
            for(int j = i + 1; j < r + 1; j++){
                answer = Math.min(i * j % 2019, answer);
            }
        }
        // 出力
        System.out.println(answer);

    }

}
