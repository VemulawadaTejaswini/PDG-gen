import java.util.Scanner;

/*

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long K= sc.nextLong();
        long D = sc.nextLong();

        long temp =1000000000000000L;
        for (long i = K; i >= 0; i--) {
            long temp2 = Math.min(Math.abs(X-D*i), Math.abs(X+D*i));
            if (temp > temp2) {
            	temp = temp2;
            }
        }


        System.out.println(temp);
    }
}