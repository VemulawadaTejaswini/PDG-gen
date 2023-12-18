import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Helix = sc.next();
        if (Helix.equals("A")) {
            System.out.println("T");
        } else if (Helix.equals("T")) {
            System.out.println("A");
        } else if (Helix.equals("G")) {
            System.out.println("C");
        } else if (Helix.equals("C")) {
            System.out.println("G");
        }
    }

}
