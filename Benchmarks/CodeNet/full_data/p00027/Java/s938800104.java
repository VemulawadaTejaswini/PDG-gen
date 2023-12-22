import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday".split(" ");
        int[] month = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int[] monthDays = new int[12];
        monthDays[0] = 0;
        for (int i = 1; i < 12; i++) {
            monthDays[i] = month[i - 1] + monthDays[i - 1];
        }
        while (true) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            if (m == 0 && d == 0) {
                break;
            }
            System.out.println(days[(monthDays[m - 1] + d + 2) % 7]);
        }

    }
}
