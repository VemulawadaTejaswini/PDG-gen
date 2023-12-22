import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (;;) {
            double m, f, r;

            m = scanner.nextDouble();
            f = scanner.nextDouble();
            r = scanner.nextDouble();

            if (m + f + r == -3)
                return;

            String grade;

            if (m == -1 || f == -1)
                grade = "F";
            else if (m + f >= 80)
                grade = "A";
            else if (m + f >= 65)
                grade = "B";
            else if (m + f >= 50 || (m + f >= 30 && r >= 50))
                grade = "C";
            else if (m + f >= 30)
                grade = "D";
            else
                grade = "F";

            System.out.println(grade);
        }
    }
}
