import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        try{
            //入力
            int N = scan.nextInt();
            int[] h_ = new int [N];
            int sum = 0;
            for(int i = 0; i < N; i++){
                sum += h_[i] = scan.nextInt();
            }

            int count = 0;
            while(sum != 0){
                int l = getLeft(h_, N);
                int r = getRight(h_, N, l);
                for(int i = l; i <= r; i++){
                    h_[i]--;
                }
                sum -= r-l+1;
                count++;
            }

            System.out.println(count);

        }finally{
            scan.close();
        }
    }

    //左端取得
    static int getLeft(int[] h, int N){
        int l = 0;
        for(int i = 0; i < N; i++){
            if(h[i] != 0){
                l = i;
                break;
            }else{
            }
        }
        return l;
    }
    //右端取得
    static int getRight(int[] h, int N, int l){
        int r = 0;
        for(int i = l; i < N; i++){
            if(h[i] == 0){
                r = i-1;
                break;
            }else if(i == N-1){
                r = N-1;
            }
        }
        return r;
    }
}
