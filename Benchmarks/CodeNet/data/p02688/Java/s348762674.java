import java.util.Scanner;

public class Main {
    public static void main(final String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int d[];
        d = new int[K];
        int A[][];
        A = new int[K][N];
        for(int k = 0; k < K;k++){
            d[k] = scan.nextInt();
            for(int dc = 0;dc < d[k];dc++){
                A[k][dc] = scan.nextInt();
            }
        }
        int R = 0;
        for(int y = 0;y < N;y++){
            for(int x = 0;x < K;x++){
                if(A[x][y] != 0){
                    break;
                }else if(x == K-1){
                    R++;
                }
            }
        }
        System.out.println(R);
    }
}