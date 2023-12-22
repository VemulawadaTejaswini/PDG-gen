import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        int[] abc = new int[26];

        char a = 'a';
        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            c = Character.toLowerCase(c);
            for (int j = 0; j <= ('Z' - 'A'); j++) {
                if (c == a) abc[j]++;
                a++;
            }
        }
        
        for (int i = 0; i <= ('Z' - 'A'); i++) {
            System.out.println(a++ + " " + abc[i]);
        }
    }
}