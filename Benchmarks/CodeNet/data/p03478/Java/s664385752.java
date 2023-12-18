import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] num = new int[5]; 
        int sum = 0;
        int ans = 0;

        for(int i = 1; i <= N; i++){
            //数字iの各桁の和を算出
            int tmp = i;
            for(int j = 0; j < 5; j++){
                num[j] = tmp % 10;
                tmp /= 10;
            }
            sum = num[0] + num[1] + num[2] + num[3] + num[4];
            
          	//数字iの各桁の和がA以上B以下ならば加算
            if(sum >= A && sum <= B) ans += i;
        }
        System.out.println(ans);
    }
}
