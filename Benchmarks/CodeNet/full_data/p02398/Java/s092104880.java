import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int res = 0;
        for (int i = a; i <= b; i++) {
            if (c%i == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}