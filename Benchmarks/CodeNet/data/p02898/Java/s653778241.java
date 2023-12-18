import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int maxHeight = sc.nextInt();
        int ableToRide = 0;
        for (int i = 0; i < count; i++) {
            if (sc.nextInt() >= maxHeight) {
                ableToRide++;
            }
        }
        sc.close();

        System.out.println(ableToRide);
    }
}