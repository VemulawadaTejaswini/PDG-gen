import java.util.*;

public class Main {

    static int numOfMultiples(int idx, String word) {
        int result = 0;
        int modResult = 0;
        for (int i = idx; i < word.length(); i++) {
            modResult = 10 * modResult + (word.charAt(i) - '0');
            modResult = modResult % 2019;
            if (modResult == 0) result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        for (int i = 0; i < word.length(); i++) {
            result += numOfMultiples(i, word);
        }
        System.out.println(result);
    }
}