import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i < 2000; i++) {
            int tmp1 = (int) (i * 0.08);
            int tmp2 = (int) (i * 0.1);
            if(tmp1 == a && tmp2 == b) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
