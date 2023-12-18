import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        ArrayList<String> wordsList = new ArrayList<>();
        for (char aChar : chars) {
            wordsList.add(Character.toString(aChar));
        }
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();

        if (word.equals("zyxwvutsrqponmlkjihgfedcba")) {
            System.out.println("-1");
            return;
        }

        for (char c : word.toCharArray()) {
            wordsList.remove(Character.toString(c));
        }

        if (wordsList.size() == 0) {
            // wordsList => non-used
            int i = 25;
            while (true) {
                if (i == 1) {
                    char c = (char) (word.charAt(0) + 1);
                    System.out.println(c);
                    return;
                }

                for (int j = i; j < 26; j++) {
                    String s = Character.toString(word.toCharArray()[j]);
                    wordsList.add(s);
                }
                if (wordsList.size() != 0) {
                    wordsList.remove(0);
                    Collections.sort(wordsList);
                }
                if (wordsList.size() == 0) {
                    --i;
                    continue;
                }
                String newWord = word.substring(0, i) + wordsList.get(0);
                if (!compare(newWord.substring(i), word.substring(i))) {
                    --i;
                    wordsList.clear();
                    continue;
                }
                System.out.println(newWord);
                break;
            }
        } else {
            System.out.println(word + wordsList.get(0));
        }
    }

    public static boolean compare(String left, String right) {
        // left大きければtrue
        if (left.equals(right)) {
            return false;
        }
        int ii = left.charAt(0) - right.charAt(0);
        return ii != 0 && ii > 0;
    }
}
