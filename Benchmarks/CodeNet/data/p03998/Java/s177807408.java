import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, char[]> cardMap = new HashMap<Character, char[]>();
        cardMap.put('a', scanner.nextLine().toCharArray());
        cardMap.put('b', scanner.nextLine().toCharArray());
        cardMap.put('c', scanner.nextLine().toCharArray());
        Map<Character, Integer> indexMap = new HashMap<Character, Integer>();
        indexMap.put('a', 0);
        indexMap.put('b', 0);
        indexMap.put('c', 0);

        System.out.print(play('a', cardMap, indexMap));


    }

    private static char play(char now, Map<Character, char[]> cardMap, Map<Character, Integer> indexMap) {
        char card[] = cardMap.get(now);
        int index = indexMap.get(now);

        if (index >= card.length )
            return Character.toUpperCase(now);

        char next = card[index];
        indexMap.put(now, index+1);
        return play(next, cardMap, indexMap);
    }
}
