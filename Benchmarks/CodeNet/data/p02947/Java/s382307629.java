import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String countStr = scanner.nextLine();
        int count = Integer.parseInt(countStr);

        List<Set<Character>> charsList = new ArrayList<>();
        for (int i=0; i<count; i++) {
            String line = scanner.nextLine();
            Set<Character> charSet = new HashSet<>();
            for (int j=0; j<line.length(); j++) {
                charSet.add(line.charAt(j));
            }
            charsList.add(charSet);
        }
        long result = 0;
        for (int i=0; i<count-1; i++) {
            for (int j=i+1; j<count; j++) {
                Set<Character> setI = charsList.get(i);
                Set<Character> setJ = charsList.get(j);
                if (setI.equals(setJ)) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }

}
