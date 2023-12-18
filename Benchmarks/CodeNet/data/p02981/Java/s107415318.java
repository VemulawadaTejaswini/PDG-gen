import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()); // 人数
        int a = Integer.parseInt(sc.next()); // 一人当たりの電車代
        int b = Integer.parseInt(sc.next()); // 人数分のタクシー代
        int answer = Math.min(a * n, b);
        System.out.println(answer);
        sc.close();
    }
}