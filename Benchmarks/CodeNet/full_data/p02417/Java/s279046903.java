import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String string = scan.nextLine();
        char a = 'a';
        int count[] = new int[26];

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                count[Character.toLowerCase(string.charAt(i)) - 'a']++;
        }

        for (int i = 0; i < 26; i++)
            System.out.println(a++ + " : " + count[i]);
    }
}