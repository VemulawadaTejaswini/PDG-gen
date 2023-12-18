import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        int z = Integer.parseInt(sc.next());
        if (x % (y + z) >= z) {
            System.out.println(x / (y + z));
        } else {
            System.out.println(x / (y + z) - 1);
        }

    }
}