
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        if (number >= 400 && number < 600) {
            System.out.println("8");
        } else if (number >= 600 && number < 800) {
            System.out.println("7");
        } else if (number >= 800 && number < 1000) {
            System.out.println("6");
        } else if (number >= 1000 && number < 1200) {
            System.out.println("5");
        } else if (number >= 1200 && number < 1400) {
            System.out.println("4");
        } else if (number >= 1400 && number < 1600) {
            System.out.println("3");
        } else if (number >= 1600 && number < 1800) {
            System.out.println("2");
        } else if (number >= 1800 && number < 2000) {
            System.out.println("1");
        }

    }
}