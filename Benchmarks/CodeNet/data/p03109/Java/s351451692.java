import java.util.Scanner;

public class Main {

    static void main(String[] args) {

        String k = "2019/04/30";
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.contains("2019")) {
            if (s.contains("04")|s.contains("03")|s.contains("02")|s.contains("01")) {
                System.out.println("Heisei");
            } else {
                System.out.println("TBD");
            }
        }
    }
}
