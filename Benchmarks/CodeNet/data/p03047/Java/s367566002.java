import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int r = sc.nextInt();
        // スペース区切りの整数の入力
        int g = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int ans = 0;
        //for文
        for(int i = 0; i < r; i++){
            for(int j = 0; i < g; i++){
                for(int k = 0; i < b; i++){
                    if(i+j+k == n) ans++;
                }
            }
        }
        // 出力
        System.out.println(ans);

    }

}
