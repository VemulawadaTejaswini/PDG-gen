import java.io.BufferedInputStream;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b+c >= 22) System.out.println("bust");
        else System.out.println("win");
    }

    private static int solve(String s, int n) {
        return n;
    }

    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
}