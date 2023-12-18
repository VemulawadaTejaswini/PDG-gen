import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		long n = sc.nextLong();
        long ans = 0;
        //for文
        for(long i = 1; i < n; i++){
            if(n % i == 0 && n % i = > i){
                ans += n - 1;
            }
        }
        // 出力
        System.out.println(ans);

    }

}