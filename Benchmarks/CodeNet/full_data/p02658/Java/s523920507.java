import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // a[i]の取得
        long[] a = new long[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextLong();
            // ゼロがあった場合は，0を返して終了
            if(a[i]==0){
                System.out.println(0);
                return;
            }
        }
        // ゼロがない場合，回答を求める
        long ans = 1L;
        long upper = 1000000000000000000L;
        for(int j=0; j<n; j++){
            // 10^18を超えたら-1にしてループを抜ける
            if(a[j] > upper/ans){
                ans = -1;
                break;
            }
            // 乗算を行う
            ans *= a[j];
        }
        System.out.println(ans);
    }
}