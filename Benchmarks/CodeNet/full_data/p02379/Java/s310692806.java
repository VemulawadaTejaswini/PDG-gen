import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = Integer.parseInt(sc.next());
        int y1 = Integer.parseInt(sc.next());
        int x2 = Integer.parseInt(sc.next());
        int y2 = Integer.parseInt(sc.next());

        System.out.println(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}