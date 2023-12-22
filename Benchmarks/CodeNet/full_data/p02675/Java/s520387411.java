import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String strN = String.valueOf(N);
        String firstPlace = strN.substring(strN.length() - 1);
        String [] hon = {"2", "4", "5", "7", "9"};
        String [] pon = {"0", "1", "6", "8"};

        if (Arrays.stream(hon).anyMatch(str -> firstPlace.equals(str))) {
            System.out.println("hon");
        } else if (Arrays.stream(pon).anyMatch(str -> firstPlace.equals(str))) {
            System.out.println("pon");
        } else {
            System.out.println("bon");
        }

    }
}
