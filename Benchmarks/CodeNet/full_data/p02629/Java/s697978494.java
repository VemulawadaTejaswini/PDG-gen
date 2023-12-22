import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] spell = { 
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", 
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", 
            "u", "v", "w", "x", "y", "z" };

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.next()) - 1;

        int spellSetCount = (int) Math.floor(number / 26);
        int restOfSpellSetCount = (int) number % 26;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < spellSetCount; i++) {
            sb.append("a");
        }

        sb.append(spell[restOfSpellSetCount]);

        System.out.println(sb.toString());
        sc.close();
    }
}
