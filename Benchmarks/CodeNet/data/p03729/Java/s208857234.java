import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws Exception {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String[] inputWords = br.readLine().split(" ");
            String lastCharOfFirstWord = getLastCharacter(inputWords[0]);
            String firstCharOfSecondWord = getFirstCharacter(inputWords[1]);
            String lastCharOfSecondWord = getLastCharacter(inputWords[1]);
            String firstCharOfThirdWord = getFirstCharacter(inputWords[2]);

            if (lastCharOfFirstWord.equals(firstCharOfSecondWord)
                && lastCharOfSecondWord.equals(firstCharOfThirdWord)) {
                
                System.out.println("YES");
                
            } else {

                System.out.println("NO");

            }
            

        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (final Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }

    private static String getFirstCharacter(String word) {
        return word.substring(0, 1);
    }

    private static String getLastCharacter(String word) {
        return word.substring(word.length() - 1, word.length());
    }
}