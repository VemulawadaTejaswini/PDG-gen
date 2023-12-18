import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        check(num);
    }

    public static void check(String num) {
        int cnt = Integer.parseInt(num);
        System.out.println(cnt*cnt*3);
    }
}