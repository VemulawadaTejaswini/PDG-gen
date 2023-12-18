import java.util.*;
class TakAndHotels {
        public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                //連続泊数
                int N = sc.nextInt();
                //区切り泊数
                int K = sc.nextInt();
                //初期一泊価格
                int X = sc.nextInt();
                //後期一泊価格
                int Y = sc.nextInt();
                int ans;
                if(N <= K){
                        ans = N * K;
                }else{
                        ans = K * X + (N - K) * Y;
                }
                System.out.println(ans);
        }
}