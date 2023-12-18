import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int g = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int ans = r * 100 + g * 10 + b;
        System.out.println(ans % 4 == 0 ? "YES" : "NO");
    }
}