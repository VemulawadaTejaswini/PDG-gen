import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int x = Integer.parseInt(scan.next());

        System.out.println((int) Math.pow((double) x, 3d));
    }
}