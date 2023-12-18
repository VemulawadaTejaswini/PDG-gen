import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int m = sc.nextInt();
        int l_max =  sc.nextInt();
        int r_min =  sc.nextInt();;

        for(int i = 0; i < m - 1; i++){
            l_max = Math.max(l_max, sc.nextInt());
            r_min = Math.min(r_min, sc.nextInt());
        }

        // 出力
        System.out.println(r_min - l_max + 1);

    }

}