import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = String.valueOf(sc.nextInt());
        long k = sc.nextLong();

        for (int i = 0; i < s.length(); i++) {
            k--;
            int num = Character.getNumericValue(s.charAt(i));

            if (num == 1 && k == 0) {
                System.out.println(1);
                return;
            }

            if (num != 1) {
                System.out.println(num);
                return;
            }
        }

        System.out.println(1);

    }
}