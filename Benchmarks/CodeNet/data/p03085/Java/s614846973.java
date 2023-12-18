import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
            Scanner scanner = new Scanner(System.in);

            String b = scanner.nextLine();

            if (b.matches("A")) {
            	 System.out.println("G");
            } else if (b.matches("G")) {
               System.out.println("A");
            } else if (b.matches("T")) {
               System.out.println("C");
            } else if (b.matches("C")) {
              System.out.println("T");
            }
            scanner.close();
    }
}
