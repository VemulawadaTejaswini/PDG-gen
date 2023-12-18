import java.util.Scanner;
import java.util.Arrays;

public class Main {

public static void main(String [] args){

        int N,K;
        int count =0;
        Scanner input = new Scanner(System.in);

        N = input.nextInt();
        K = input.nextInt();

        for (int i=1; i<=N; i++ ) {
                for (int j=1; j<=N; j++ ) {
                        if (i%j >=K) {
                                count++;
                        }
                }
        }

        System.out.println(count);
}
}
