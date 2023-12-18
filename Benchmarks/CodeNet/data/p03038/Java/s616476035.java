import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // スペース区切りの整数の入力
        int m = sc.nextInt();
        //配列の宣言
        //int[] num = new int[n];
        long[] num = new long[n];
        Arrays.sort(num);

        for(int i = 0; i < n; i++){
            //num[i] = sc.nextInt();
            num[i] = sc.nextLong();
        }

        int b;
        long c;
        for(int i = 0; i < m; i++){
            //b = sc.nextInt();
            b = sc.nextInt();
            //c = sc.nextInt();
            c = sc.nextLong();
            for(int j = 0; j < b; j++){
                if(num[j] < c) num[j] = c;
                else break;
            }
            Arrays.sort(num);
        }

        long ans = 0;
        for(int i = 0; i < n; i++){
            ans += num[i];
        }

        // 出力
        System.out.println(ans);

    }

}