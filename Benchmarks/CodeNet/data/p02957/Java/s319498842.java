import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(); int y = scan.nextInt();
        if((x + y) % 2 == 0) System.out.println((x + y) / 2);
        else System.out.println("IMPOSSIBLE");
        scan.close();
    }
}