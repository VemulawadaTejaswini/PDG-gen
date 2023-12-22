import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        for(int i = 0; ; i++) {
            x = sc.nextInt();
            if (x == 0) {
                break;
            }
            System.out.printf("Case %d: %d", i, x);
        }
    }
}

