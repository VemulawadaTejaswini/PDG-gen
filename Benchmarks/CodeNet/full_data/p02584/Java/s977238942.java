import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K= sc.nextLong();
        long D = sc.nextLong();

        long ans = 0;
        long kaisu = X / D;
        if (kaisu >= K) {
            ans = Math.abs(X - (D * K));
        } else {
            if ((K-kaisu) %2 == 0) {
                ans = Math.abs(X - (D * kaisu));
            } else {
                ans = Math.abs(X - (D * (kaisu+1)));
            }
        }

        System.out.println(ans);
    }
}