import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            long K = in.nextLong();
            long A = in.nextLong();
            long B = in.nextLong();
            long maxBiscuits = K + 1;
            if( K - 1 < A || A >= B){
                System.out.println(maxBiscuits);
            }else{
                long N = (K + 1 - A) / 2;
                long biscuits = A + (B - A) * N + ((K + 1 - A) % 2);
                maxBiscuits = Math.max(maxBiscuits, biscuits);
                System.out.println(maxBiscuits);
            }
        }
    }
}