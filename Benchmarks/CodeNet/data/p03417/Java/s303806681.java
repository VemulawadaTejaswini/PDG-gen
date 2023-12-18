import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = Math.min(a, b);
        int m = Math.max(a, b);

        long res = 0;
        if(n == 1) {
            if (m == 1) {
                res = 1;
            } else {
                res = m - 2;
            }
        } else {
            res = (long) (n - 2) * (m - 2);

        }

        System.out.println(res);
    }

}
