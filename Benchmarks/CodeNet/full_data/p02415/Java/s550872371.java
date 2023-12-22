import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();

        ArrayList<String> charBefore = new ArrayList<>();
        ArrayList<String> charAfter = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            charBefore.add(string.substring(i, i + 1));
            charAfter.add(charBefore.get(i).toUpperCase());
            if (charBefore.get(i).equals(charAfter.get(i))) {
                charAfter.set(i, charBefore.get(i).toLowerCase());
            }
            System.out.print(charAfter.get(i));
        }
        System.out.println();
    }
}