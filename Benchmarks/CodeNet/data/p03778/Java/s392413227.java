import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        System.out.println(a+w>=b?0:b-(a+w));
    }
}
