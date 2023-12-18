import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = Integer.parseInt(in.nextLine().split(" ")[0]);
        int y = Integer.parseInt(in.nextLine().split(" ")[1]);
        String xb = Integer.toBinaryString(x);
        String yb = integer.toBinaryString(y);
        int z = !(xb.length() == 32 ^ yb.length() == 32) && y - x < 0 ? Math.abs(x) - Math.abs(y) + 2
                : (!(xb.length() == 32 ^ yb.length() == 32) && x - y < 0)
                || (xb.length() == 0 ^ yb.length() == 0) && x - y < 0 ? Math.abs(y) - Math.abs(x)
                : Math.abs(y) > Math.abs(x) ? Math.abs(y) - Math.abs(x) + 1 : Math.abs(x) -Math.abs(y) + 1;
        System.out.println(z);
    }
}