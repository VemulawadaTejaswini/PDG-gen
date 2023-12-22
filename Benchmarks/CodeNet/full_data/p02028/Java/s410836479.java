import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int W = scan.nextInt();
        long A[] = new long[H + 1];
        long B[] = new long[W + 1];
        A[0] = 0;
        for(int i = 1; i <= H; i++){
            A[i] = -scan.nextInt();
        }
        B[0] = 0;
        for(int i = 1; i <= W; i++){
            B[i] = -scan.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B);
        int pos1 = 0, pos2 = 0;
        long ans = 0;
        for(int loop = 0; loop < H + W; loop++){
            if(A[pos1] < B[pos2]){
                ans += pos2 * A[pos1];
                pos1 += 1;
            }else{
                ans += pos1 * B[pos2];
                pos2 += 1;
            }
        }
        System.out.println(-ans);
    }
}

