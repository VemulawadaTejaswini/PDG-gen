import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            if (n == 0 && x == 0)
                break;

            int count = 0;

            int n1 = 1, n2 = 2;

            for (n1 = 1; n1<= n - 2; n1++) {
                for (n2 = n1 + 1; n2<= n - 1; n2++) {
                    if(n - n1 - n2 > n2 && n - n1 - n2 <= n)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
