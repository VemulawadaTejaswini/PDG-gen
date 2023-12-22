import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            StringBuffer str = new StringBuffer(scan.nextLine());
            System.out.println(str.reverse());
        } catch (Exception e) {
            System.exit(0);
        }
    }
}