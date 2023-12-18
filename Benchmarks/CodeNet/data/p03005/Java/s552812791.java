import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int ans;
        if(b == 0) ans = 0;
        else ans = a - b;
        // 出力
        System.out.println(ans);

    }

}
