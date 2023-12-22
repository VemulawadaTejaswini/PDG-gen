import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int cnt = 0;
        while(a >= b) {
            b *= 2;
            cnt++;
        }

        while(b >= c) {
            c *= 2;
            cnt++;
        }

        if(k >= cnt) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
