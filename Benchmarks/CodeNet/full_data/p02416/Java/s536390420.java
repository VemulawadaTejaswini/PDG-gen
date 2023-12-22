import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long a = 0;
            long x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                long y;
                for (int i = 0; i < 1000; i++) {
                    if(x==0) {
                        break;
                    }
                    y = x % 10;
                    x = x - y;
                    x = x / 10;
                    a = a + y;
                }
                System.out.println(a);
            }
        }
    }
}
