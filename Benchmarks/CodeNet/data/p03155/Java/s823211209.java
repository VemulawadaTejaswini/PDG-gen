import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int hCnt = 0;
        int wCnt = 0;
        for (int i = 0; i < n; i++) {
            if (i + h <= n)
                hCnt++;
            else
                break;
        }
        for (int i = 0; i < n; i++) {
            if (i + w <= n)
                wCnt++;
            else
                break;
        }

        System.out.println(hCnt * wCnt);
    }
}
