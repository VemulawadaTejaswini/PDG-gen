import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //値を取得
        Scanner sc = new Scanner(System.in);
        int N= sc.nextInt();
        long[] A = new long[N];
        
        long result = 1;
        for (int i = 0; i < N; ++i){
            A[i] = sc.nextLong();
            
            //0が含まれている場合は何を掛けても0になるため、ここで終了
            if (A[i] == 0){
                System.out.println(0);
                System.exit(0);
            }
            
            result *= A[i];
            
            //掛けてる途中で制限を超えたら終了
            if (result > (long)Math.pow(10,18)){
                System.out.println("-1");
                System.exit(0);
            }
        }

        //出力
        System.out.println(result);
    }
}
