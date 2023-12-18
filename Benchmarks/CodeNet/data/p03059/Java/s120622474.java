import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            min = Math.min(a[i], min);
        }
        int ans = 0;
        /*for(int i = 1; i < min + 1; i++){
            for(int j = 0;j < n; j++){
                if(a[j] % i != 0) b = false;
            }
            if(b) ans = Math.max(i, ans);
            b = true;
        }*/
        for(int i = 0; i < n; i++){
            for(int j = 1; j < min + 1; j++){
                for(int k = 0; k < n; k++){
                    if(k != i && a[k] % j != 0){
                        ans = Math.max(j, ans);
                        break;
                    }
                }
            }
        }

        // 出力
        System.out.println(ans);

    }

}