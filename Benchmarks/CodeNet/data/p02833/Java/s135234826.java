import java.io.BufferedInputStream;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static final int MAX = 1_000_000_000;
    public static void main(String[] args) {
        //System.setIn(Main.class.getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedInputStream(System.in));
        long n = sc.nextLong();
        if(n%2 == 1) System.out.println(0);
        else {
            long res = 0;
            //long unit = 1;
            while(n > 10) {
                res += (n/10);
                n = n/10;
            }
            System.out.println(res);
        }
    }
    private static int nextInt(Scanner sc) {
        return Integer.valueOf(sc.nextLine());
    }
    private static int[] toArray(String text) {
        return Arrays.stream(text.split("\\s")).mapToInt(Integer::valueOf).toArray();
    }

}