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
        str = str.replace("dreamer", "");
        str = str.replace("dream", "");
        str = str.replace("eraser", "");
        str = str.replace("erase", "");
        
        if ("".equals(str)){
            ans = "YES";
        }
        System.out.println(ans);
    }
}
