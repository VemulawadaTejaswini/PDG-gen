import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = Integer.parseInt(scanner.next());
        int K = 0;

        scanner.close();
        if (360 % X == 0){
            K = 360 / X;
        } else {
            K = lcm(360, X);
            K /= X;
        }
        

        System.out.println(K);
    }

    static int lcm (int a, int b) {
        int tmp;
        long c = a;
        c *= b;
        while((tmp = a % b) !=0 ) {
            a = b;
            b = tmp;
        }
        return (int)(c / b);
    }
}
