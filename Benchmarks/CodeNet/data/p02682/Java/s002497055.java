import java.util.*;

public class Main {
    public static void main(String[] args ) throws Exception {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        
        long takeA = 0;
        long takeB = 0;
        long takeC = 0;
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
