import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();

        int x = Integer.parseInt(N.charAt(0) + "");
        int y = Integer.parseInt(N.charAt(1) + "");
        int z = Integer.parseInt(N.charAt(2) + "");

        int max = Math.max(x, Math.max(y, z));

        System.out.println(max + "" + max + "" + max);
    }
}