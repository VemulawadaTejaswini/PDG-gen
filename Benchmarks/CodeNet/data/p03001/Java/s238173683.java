import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int totalArea = w * h;
        int xhArea = x * h;
        int xhDiff = totalArea - xhArea;
        int wyArea = w * y;
        int wyDiff = totalArea - wyArea;

        double maxDiff = Math.max(xhDiff, wyDiff) * 1.0;
        boolean isMulti = x*2==w && y*2==h;

        System.out.print(maxDiff + " ");
        System.out.println(isMulti ? "1" : "0");
    }
}