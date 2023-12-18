import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int cnt;

        cnt = (X / 500) * 1000;
        X %= 500;

        cnt += (X / 5)*5;

        System.out.println(cnt);
    }
}
