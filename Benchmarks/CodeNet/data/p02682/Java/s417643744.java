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
        long takes = 0;
        long sum = 0;
        if(A == K) {
            sum = A;
        } else if(0 < B && C == 0){
            sum = A;
        } else if(0 < B && 0 < C) {
            if((K - A) == B){
                sum = A;
            } else if(0 <= (C - B)){
                sum = A - (C - B);
            } else {
                sum = A;
            }
        }
        System.out.println(sum);
    }
}
