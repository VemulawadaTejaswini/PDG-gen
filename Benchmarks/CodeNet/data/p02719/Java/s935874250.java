import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long temp = 0;
        boolean flg = true;

        while (flg) {
            temp = Math.abs(n-k);

            if (n < temp) {
                flg = false;
            } else {
            n = temp;
            }
        }
        System.out.println(n);
    }
}