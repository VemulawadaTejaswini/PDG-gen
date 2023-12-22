import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num == 2 || num == 3) {
                res++;
                continue;
            }
            boolean b = true;
            for (int j = 2; j*j <= num; j++) {
                if (num%j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) res++;
        }
        System.out.println(res);
    }
}