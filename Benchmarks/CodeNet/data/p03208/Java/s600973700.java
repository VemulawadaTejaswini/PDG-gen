import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] H = new int[N];
        for(int i = 0; i < N; i++){
            int h = sc.nextInt();
            H[i] = h;
            for(int j = 0; j < i; j++){
                if(h < H[j]){
                    for(int k = i; k > j; k--){
                        H[k] = H[k-1];
                    }
                    H[j] = h;
                    break;
                }
            }
        }
        sc.close();

        int min = 1000000000;
        for(int m = 0; m <= N - K; m++){
            int diff = H[K + m - 1] - H[m];
            if(diff < min) min = diff;
        }
        System.out.println(min);

    }

}
