import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inp = scanner.nextLine();
            String str = inp+inp;
            String key = scanner.nextLine();

            if(str.contains(key)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

