
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String t = scanner.next();
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < t.length() - 1 ; i++){
            {
                builder.append(t.charAt(i));
            }
        }
        System.out.println(s.equals(builder.toString()) ? "Yes" : "No");

    }
}
