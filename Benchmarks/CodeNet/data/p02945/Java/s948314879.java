import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans1 = a + b > a - b ? a+b : a-b;
        int ans2 = a * b;
        System.out.println(Math.max(ans1, ans2));
    }
}