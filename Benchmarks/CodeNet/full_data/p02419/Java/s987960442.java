import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner inp = new Scanner(System.in);

        String find = inp.next();

        String s = "";

        ArrayList<String> stringArray = new ArrayList<>();

        while (!s.equals("END_OF_TEXT")) {
            s = inp.next();

            String[] sWords = s.trim().split(" ");

            stringArray.addAll(Arrays.asList(sWords));
        }

        System.out.println(findWord(stringArray, find)+ "");
    }

    private static int findWord(ArrayList<String> s, String find) {
        int counter = 0;
        
        String findLower = find.toLowerCase();

        for (String word : s) {
            String wordLower = word.toLowerCase();
            if (wordLower.equals(findLower)) {
                counter++;
            }
        }

        return counter;
    }
}

