import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(), w = sc.nextInt();
        System.out.println(2 * w >= s ? "unsafe" : "safe");
    }
}
