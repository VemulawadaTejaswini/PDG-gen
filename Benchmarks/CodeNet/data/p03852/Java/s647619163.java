import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("e");
        list.add("i");
        list.add("o");
        list.add("u");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        if (list.contains(str)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }

        scanner.close();
    }
}