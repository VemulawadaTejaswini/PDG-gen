import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
// ??????????????¢?????????????????????
        // boolean ret = a < b || b < c;
        boolean ret = a < b && b < c;
        System.out.println(ret ? "Yes" : "No");
    }
}