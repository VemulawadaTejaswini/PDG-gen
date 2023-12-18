import java.util.Scanner;

/*
問題文

*/

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        long count = 0;
        for (int i = 0; i < m; i++) {
            count += sc.nextInt();
        }

        if (n >= count ) {
            System.out.println(n - count);
        } else {
            System.out.println("-1");
        }
    }
}