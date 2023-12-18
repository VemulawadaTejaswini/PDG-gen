import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a*b;
        res /= fun(a,b);
        System.out.println(res);

    }

    public static int fun(int a, int b) {
        return (a==0) ? b : fun(b%a, a);
    }
}
