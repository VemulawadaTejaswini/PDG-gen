import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int q = K / 9;
        int r = K % 9;

        for (int i = 0; i <= q; i++) {

            if(i < q){
                for (int j = 1; j <= 9; j++) {
                    System.out.println(( j + 1 ) * ( (long ) Math.pow( 10 , i ) ) - 1 ) ;
                }
            }else{
                for (int j = 1; j <= r; j++) {
                    System.out.println(( j + 1 ) * ( (long ) Math.pow( 10 , i ) ) - 1 ) ;
                }

            }
        }
    }
}
