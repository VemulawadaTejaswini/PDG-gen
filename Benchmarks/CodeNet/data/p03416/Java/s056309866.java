import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int cnt = 0;
        for (int i = a; i <= b; i++) {
            int r = i % 100;
            int l = i / 1000;
            if (r == l)   cnt++;
        }
        
        System.out.println(cnt);
    }
}