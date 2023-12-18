

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        String s = std.next();
        String[] vowels = {"a", "i", "u", "e", "o"};
        if (Arrays.asList(vowels).contains(s)) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
