import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int[] results = {a + b, a * b, a - b};
        Arrays.sort(results);
        System.out.println(results[2]);
    }
}
