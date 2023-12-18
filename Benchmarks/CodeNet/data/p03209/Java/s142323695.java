import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long X = sc.nextLong();

        String base = "P";
        for (int i =0; i<N; i++) {
            base = makeBugger(base);
        }

        int result = 0;
        for (int i = 0; i<X; i++) {
            int index = base.length()-1-i;
            if (base.charAt(index)=='P') {
                result++;
            }
        }
        System.out.println(result);
    }

    public static String makeBugger(String base) {
        return "B" + base + "P" + base + "B";
    }

}