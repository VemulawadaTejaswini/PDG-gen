import java.io.BufferedInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static final int MAX = 1_000_000_000;
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int  a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b/pgcd(a, b));
    }

    static int pgcd(int a, int b) {
        if(b == 0) return a;
        return pgcd(b, a%b);
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("")).mapToInt(Integer::valueOf).toArray();
    }

}