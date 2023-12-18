import java.io.BufferedInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static final int MAX = 1_000_000_000;
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        int  n = sc.nextInt();
        sc.nextLine();
        int[] a = toArray(sc.nextLine());
        int current = 1;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == current) {
                current++;
            }
        }
        if(current == 1) System.out.println(-1);
        else System.out.println(n-current+1);
    }

    static long pgcd(long a, long b) {
        if(b == 0) return a;
        return pgcd(b, a%b);
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}