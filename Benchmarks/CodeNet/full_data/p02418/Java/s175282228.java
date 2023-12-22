import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        String strings = string + string;
        String keywords = scan.nextLine();

        System.out.println(strings.matches(".*" + keywords + ".*")? "Yes" : "No");
    }
}