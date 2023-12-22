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

    public static void main(String[] args) throws IOException {
        List<TicTacToe> ticTacToeList = readTicTacToe();
        for (TicTacToe ticTacToe : ticTacToeList) {
            // System.out.println(ticTacToe);
            System.out.println(ticTacToe.judge());
        }
    }

    private static List<TicTacToe> readTicTacToe() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<TicTacToe> ticTacToeList = new ArrayList<>();
        String line = null;
        while ((line = reader.readLine()) != null) {
            ticTacToeList.add(new TicTacToe(line));
        }
        return ticTacToeList;
    }

    // Tic Tac Toe
    private static class TicTacToe {

        // Win pattern
        Pattern[] WIN_PATTERN = { Pattern.compile(".*1.*4.*7.*"), Pattern.compile(".*2.*5.*8.*"),
                Pattern.compile(".*3.*6.*9.*"), Pattern.compile(".*1.*2.*3.*"), Pattern.compile(".*4.*5.*6.*"),
                Pattern.compile(".*7.*8.*9.*"), Pattern.compile(".*1.*5.*9.*"), Pattern.compile(".*3.*5.*7.*") };

        // position
        private String o = "";
        private String x = "";

        // Constructor
        public TicTacToe(String input) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'o') {
                    o = o + (i + 1);
                } else if (input.charAt(i) == 'x') {
                    x = x + (i + 1);
                }
            }
        }

        // Judge
        private char judge() {
            // Check o
            for (Pattern p : WIN_PATTERN) {
                if (p.matcher(o).matches()) {
                    return 'o';
                }
            }
            // Check x
            for (Pattern p : WIN_PATTERN) {
                if (p.matcher(x).matches()) {
                    return 'x';
                }
            }
            return 'd';
        }

        @Override
        public String toString() {
            return "o: " + o + ", x: " + x;
        }
    }
}