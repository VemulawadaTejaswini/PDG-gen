import java.util.Scanner;

/**
 * @author subaru
 */
public class Main {
    // Five Transportations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long minCapacity = Long.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            long capacity = sc.nextLong();
            if (capacity < minCapacity) {
                minCapacity = capacity;
            }
        }
        long answer = 5 + (N / minCapacity) - 1 + (N % minCapacity == 0 ? 0 : 1);
        System.out.println(answer);
    }
}
