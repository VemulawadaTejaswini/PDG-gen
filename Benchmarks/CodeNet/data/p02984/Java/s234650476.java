import java.util.*;

public class Main{

    public static void main(String args[]){

        // スキャナーの宣言
        Scanner sc = new Scanner(System.in);
        // 整数の入力
		int n = sc.nextInt();
        // 配列の宣言
        int[] a = new int[n];
        int sum = 0;
        // for文
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            sum += a[i];
        }

        int[] answer = new int[n];
        for(int i = 0; i < sum; i += 2){
            answer[0] = i;
            int ans_sum = i;
            for(int j = 1; j < n; j++){
                answer[j] = a[j - 1] * 2 - answer[j - 1];
                ans_sum += answer[j];
            }
            if(ans_sum == sum) break;
        }

        String s = "";
        for(int i = 0; i < n; i++){
            s = s + answer[i] + " ";
        }

        // 出力
        System.out.println(s);

    }

}
