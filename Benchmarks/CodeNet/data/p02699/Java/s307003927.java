import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        System.out.println(problem164a(s, w));
    }

    private static String problem164a(int s, int w) {
        return (s <= w) ? "unsafe" : "safe";
    }
}