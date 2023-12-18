import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int N = scan.nextInt();
            int K = scan.nextInt();
            int[] h_ = new int[N];
            for(int i = 0; i < N; i++){
                h_[i] = scan.nextInt();
            }

            Arrays.sort(h_);

            int high = getTree(h_,N, K);

            System.out.println(high);

        }finally{
            scan.close();
        }
    }

    //飾り付ける木の高さの範囲を取得
    static int getTree(int[] h, int n, int k){
        int diff = h[k-1]-h[0];
        for(int i = 1; i < n-k+1; i++){
            int tmp = h[i+k-1]-h[i];
            if(tmp < diff){
                diff = tmp;
            }
        }
        return diff;
    }
}
