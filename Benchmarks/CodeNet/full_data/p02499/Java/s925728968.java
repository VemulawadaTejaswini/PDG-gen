import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Map<Character, Integer> counts = new HashMap<Character, Integer>();
        for (Character ch = 'a'; ch <= 'z'; ch++)
            counts.put(ch, 0);

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String line = scan.nextLine();

            for (char rawch: line.toCharArray()) {
                Character ch = Character.toLowerCase(rawch);

                int count = 0; 
                if (counts.containsKey(ch))
                    count = counts.get(ch);
                counts.put(ch, count+1);
            }
        }

        for (Character ch = 'a'; ch <= 'z'; ch++) {
            int count = counts.get(ch);
            System.out.printf("%c : %d\n", ch, count);
        }
    }
}