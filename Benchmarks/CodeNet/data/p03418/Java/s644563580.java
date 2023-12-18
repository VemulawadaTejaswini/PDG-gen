import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        int N,K;
        int count =0;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        K = input.nextInt();

        if (K ==0) {
                count =N*N;
        }else{
                int a = K+1;
                for (int b=K+1; b<=N; b++ ) {
                        count += N/b * (b-K);
                        if (N%b > K-1) {
                                count += N%b-(K-1);
                        }
                }
        }


        System.out.println(count);
}
}
