import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int x = sc.nextInt();
        int d = 0;
        int count = 1;
        // for文
        for(int i = 0; i < n; i++){
            d = d + sc.nextInt();
            if(d <= x) count++;
            else break;
        }
        // 出力
        System.out.println(count);

    }

}