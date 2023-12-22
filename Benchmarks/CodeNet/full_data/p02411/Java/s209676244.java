import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int r = scanner.nextInt();
    while (m >= 0 || f >= 0) {
            char grade = ' ';
            int mf = m + f;
            if (m < 0 || f < 0) grade = 'F';
            else if (mf >= 80) grade = 'A';
            else if (65 <= mf && mf < 80) grade = 'B';
            else if (50 <= mf && mf < 65) grade = 'C';
            else if (30 <= mf && mf < 50) {
                grade = 'D';
                if (r >= 50) grade = 'C';
            } else if (mf < 30) grade = 'F';
            System.out.println(grade);
            m = scanner.nextInt();
            f = scanner.nextInt();
            r = scanner.nextInt();
        }
    }
}
