import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            int r2 = i % 10;
            int r1 = i % 100 / 10;
            int l1 = i % 10000 / 1000;
            int l2 = i / 10000;
            
            if (r2 == l2 && r1 == l1)
                cnt++;
        }

        System.out.println(cnt);
    }
}
