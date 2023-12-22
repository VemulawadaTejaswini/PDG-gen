import java.util.*;

class Main {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        boolean first = true;

        while (sc.hasNext()) {
            String word = sc.next();
            if (word.charAt(word.length() - 1) == ',' || word.charAt(word.length() - 1) == '.') {
                word = word.substring(0, word.length() - 1);
            }
            if (3 <= word.length() && word.length() <= 6) {
                if (first) {
                    System.out.print(word);
                    first = false;
                } else {
                    System.out.print(" " + word);
                }
            }
        }
    }
}