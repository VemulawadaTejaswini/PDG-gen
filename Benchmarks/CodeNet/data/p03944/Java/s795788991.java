import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int W1 = W;
        int H1 = H;
        int W0 = 0;
        int H0 = 0;
        int N = sc.nextInt();
        int[][] A = new int[N][3];
        for(int i = 0; i<N; i++){
            A[i][0] = sc.nextInt();
            A[i][1] = sc.nextInt();
            A[i][2] = sc.nextInt();
        }
        for(int i = 0; i<N; i++){
            switch (A[i][2]){
                case 1:
                    if(A[i][0] > W0){
                        W0 = A[i][0];
                    }
                    break;
                case 2:
                    if(A[i][0] < W1){
                        W1 = A[i][0];
                    }
                    break;
                case 3:
                    if(A[i][1] > H0){
                        H0 = A[i][1];
                    }
                    break;
                case 4:
                    if(A[i][1] < H1){
                        H1 = A[i][1];
                    }
                    break;
            }
        }
        int ans = 0;
        if(H1 > H0 && W1 > W0){
            ans = (H1 - H0) * (W1 - W0);
        }
        System.out.println(ans);
    }
}
