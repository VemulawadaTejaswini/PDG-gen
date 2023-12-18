import java.util.Scanner;

/**
 *
 * @author psygn
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        String ans = "NO";
        str = str.replace("dreamer", "[space]");
        str = str.replace("dream", "[space]");
        str = str.replace("eraser", "[space]");
        str = str.replace("erase", "[space]");
        str = str.replace("[space]", "");
        if ("".equals(str)){
            ans = "YES";
        }
        System.out.println(ans);
    }
}
