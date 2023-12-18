import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        int minDivideCount = Integer.MAX_VALUE;
        for (int i = 0; i < num; i++) {
            int count = Integer.numberOfTrailingZeros(sc.nextInt());
            if (minDivideCount > count) {
                minDivideCount = count;
            }
        }

        System.out.println(minDivideCount);
    }
}