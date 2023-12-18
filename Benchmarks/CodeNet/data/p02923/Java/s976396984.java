import java.util.Scanner;
public class Main {
    static int[] H;
    static boolean[][] memo;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int N = scan.nextInt();
        H = new int[N];
        memo = new boolean[2][N];
        int result = 0;
        int temp = 0;
        for(int i = 0; i < N; i++){
            H[i] = scan.nextInt();
        }
        for(int i = 0; i < N; i++){
            memo[0][i] = false;
            memo[1][i] = false;
        }
        for(int i = N - 2; i >= 0; i--){
            temp = constH(i,N);
            if(result < temp){
                result = temp;
            }
        }
        System.out.println(result);
        scan.close();
        
    }
    // I番目から右隣へ移動した場合の移動量を返す
    public static int constH(int I, int N){
        int result = 0;
        boolean temp = false;
        for(int i = I; i < N - 1; i++){
            if(memo[0][i]){
                temp = memo[1][i];
            }else{
                temp = H[i+1] <= H[i];
                memo[0][i] = true;
                memo[1][i] = temp;
            }
            if(temp){
                result++;
            }else{
                break;
            }
        }
        return result;
    }
    
}
