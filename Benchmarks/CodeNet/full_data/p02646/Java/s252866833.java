import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int v = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int t = sc.nextInt();

        boolean flg = false;

        int i = 0;
        while(i < t) {
            if ((a + v * i) % (b + w * i) == 0) flg = true;
            i++;
        }

        System.out.println(flg ? "YES" : "NO");
    }
}