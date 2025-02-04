import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * 0066 Tic Tac Toe
 */
public class Main {

    /** ????????°??? */
    public static int CIRCLE_INDEX = 0;
    /** ???????°??? */
    public static int CROSS_INDEX = 1;

    /** ??? */
    public static String CIRCLE = "o";
    /** ?? */
    public static String CROSS = "x";
    /** draw */
    public static String DRAW = "d";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        List<String> results = new ArrayList<>();
        while ((line = reader.readLine()) != null) {

            results.add(judge(line));
        }

        for (String result : results) {
            System.out.println(result);
        }
    }

    // Tic Tac Toe
    public static class WinPattern {

        // Win pattern
        private static final Pattern[] winPattern = { Pattern.compile(".*1.*4.*7.*"), Pattern.compile(".*2.*5.*8.*"),
                Pattern.compile(".*3.*6.*9.*"), Pattern.compile(".*1.*2.*3.*"), Pattern.compile(".*4.*5.*6.*"),
                Pattern.compile(".*7.*8.*9.*"), Pattern.compile(".*1.*5.*9.*"), Pattern.compile(".*3.*5.*7.*") };

        public static Pattern[] getWinPattern() {
            return winPattern;
        }
    }

    public static String[] createResult(String input) {
        StringBuilder o = new StringBuilder("");
        StringBuilder x = new StringBuilder("");
        String[] result = new String[2];
        for (int i = 0; i < input.length(); i++) {
            if (CIRCLE.equals(input.charAt(i))) {
                o.append(i + 1);
            } else if (CROSS.equals(input.charAt(i))) {
                x.append(i + 1);
            }
        }

        result[CIRCLE_INDEX] = o.toString();
        result[CROSS_INDEX] = x.toString();

        return result;
    }

    // Judge
    public static String judge(String line) {

        String[] result = createResult(line);
        // Check o
        for (Pattern p : WinPattern.getWinPattern()) {
            if (p.matcher(result[CIRCLE_INDEX]).matches()) {
                return CIRCLE;
            }
        }
        // Check x
        for (Pattern p : WinPattern.getWinPattern()) {
            if (p.matcher(result[CROSS_INDEX]).matches()) {
                return CROSS;
            }
        }
        return DRAW;
    }

}