import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String s = "ABC" , t = "ARC";

        if (input.equals(s)) {
            System.out.println("ARC");
        } else {
            System.out.println("ABC");
        }
    }
}

