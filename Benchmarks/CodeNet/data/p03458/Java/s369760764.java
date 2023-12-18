import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        int[] c = new int[N]; // 0 -> 'B', 1 -> 'W'

        for(int i = 0; i < N; ++i){
            x[i] = sc.nextInt() % (2 * K);
            y[i] = sc.nextInt() % (2 * K);

            if( (x[i] < K-1 && y[i] < K-1) || (x[i] >= K && y[i] >= K) ){
                c[i] = (sc.next() == "B")? 0 : 1;
            }else{
                x[i] = x[i] % K;
                y[i] = y[i] % K;
                c[i] = (sc.next() == "W")? 0 : 1; 
            }
        }
        int ans = 0;
        int[][]  tmp = new int[K][K];

        for(int i = 0; i < K; ++i){
            for(int j = 0; j < K; ++j){
                tmp[i][j] = 0;
                for(int k = 0; k < N; k++){
                    if((x[k] < i && y[k] < j) || (x[k] >= i && y[k] >= j)){
                        ++tmp[i][j];
                    }
                }
                ans =  Math.max(ans, tmp[i][j]);
            }
        }
        System.out.println(ans);
    }
}