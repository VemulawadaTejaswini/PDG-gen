import static java.lang.System.out;
import java.util.Scanner;

public class Main{
    public static void main(String...args) {

        String str = new Scanner(System.in).nextLine();
        String[] list = str.split(" ");
        int a = Integer.parseInt(list[0]);
        int b = Integer.parseInt(list[1]);

        if (a > b) {
            out.println("a > b");
        }
        else if (a < b) {
            out.println("a < b");
        }
        else {
            out.println("a == b");
        }
    }

}