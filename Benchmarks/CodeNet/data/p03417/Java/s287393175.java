import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long ans = 0;
        if (N == 1 && M == 1) {
            ans = 0;
        } else if (N == 1 && M != 1 ) {
            ans = M - 2 ;
        } else if (N != 1 && M == 1) {
            ans = N - 2;
        } else {
            ans = (N - 2) * (M - 2) ;
        }
        System.out.println(ans);
    }

}