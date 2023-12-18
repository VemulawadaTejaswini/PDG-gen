import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

    private static String input = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        input = scanner.nextLine();
        int countOfQuerries = Integer.parseInt(scanner.nextLine());

        ArrayList<String> rawQuerries = new ArrayList<>();
        for (int i = 0; i < countOfQuerries; i++) {
            rawQuerries.add(scanner.nextLine());
        }

        for (int i = 0; i < countOfQuerries; i++) {
            String[] pair = rawQuerries.get(i).split(" ");
            int from = Integer.parseInt(pair[0]) - 1;
            int to = Integer.parseInt(pair[1]) - 1;
            String finalString = convert(from, to);
            if (finalString.isEmpty()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static String convert(int from, int to) {

        char[] characters = input.toCharArray();
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            charList.add(characters[i]);
        }
        charList = replace(charList, 0);

        String result = "";
        for (Character c : charList) result += c;
        return result;

    }

    private static ArrayList<Character> replace(ArrayList<Character> input, int from) {
        ArrayList<Character> characters = input;
        if (characters.size() - from >= 2) {
            if (characters.get(from).equals(characters.get(from + 1))) {
                char keyChar = characters.get(from);
                characters.remove(from);
                characters.remove(from);
                if (keyChar != 'z') {
                    keyChar++;
                    characters.add(from, keyChar);
                }
                return replace(characters, 0);
            } else {
                return replace(characters, ++from);
            }

        } else {
            return input;
        }
    }
}
