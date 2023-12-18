import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        q_1();
    }

    private static void q_1() {
        try(Scanner scan = new Scanner(System.in)) {
            String b = scan.next();

            switch (b) {
                case "A":
                    System.out.println("T");
                    break;
                case "T":
                    System.out.println("A");
                    break;
                case "C":
                    System.out.println("G");
                case "G":
                    System.out.println("C");
            }
        }
    }
}