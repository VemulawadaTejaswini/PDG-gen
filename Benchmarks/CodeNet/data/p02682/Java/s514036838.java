import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        long K = sc.nextLong();

        int takeA = 0;
        int takeB = 0;
        int takeC = 0;
        long sum = 0;
        for (int i = 0; i < K; i++) {
            if(takeA < A){
                takeA++;
                sum++;
            } else if(takeB < B){
                takeB++;
            } else {
                takeC++;
                sum--;
            }
        }
        System.out.println(sum);
    }
}
