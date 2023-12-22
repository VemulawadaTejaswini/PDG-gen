import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String[] str = sc.nextLine().split(" ");
            String m, d;
            m = str[1].length() == 1 ? "0" + str[1] : str[1];
            d = str[2].length() == 1 ? "0" + str[2] : str[2];
            int date = Integer.parseInt(str[0] + m + d);
            int year = Integer.parseInt(str[0]);
            if (date >= 19890108) {
                System.out.println("heisei" + " " + (year - 1988) + " " + str[1] + " " + str[2]);
            } else if (date >= 19261225) {
                System.out.println("showa" + " " + (year - 1925) + " " + str[1] + " " + str[2]);
            } else if (date >= 19120730) {
                System.out.println("taisho" + " " + (year - 1911) + " " + str[1] + " " + str[2]);
            } else if (date >= 18680908) {
                System.out.println("meiji" + " " + (year - 1867) + " " + str[1] + " " + str[2]);
            } else {
                System.out.println("pre-meiji");
            }
        }
    }
}