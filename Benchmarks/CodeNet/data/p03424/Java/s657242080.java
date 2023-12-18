import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        boolean hasYellow = false;

        for (int i = 0; i < count; i++) {
            String color = sc.next();
            if (color.equals("Y")) hasYellow = true;
        }

        if (hasYellow) {
            System.out.println("Four");
        } else {
            System.out.println("Three");
        }
    }
}
