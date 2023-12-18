import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static String lcs(String s, String t){
        StringBuilder sb = new StringBuilder();
        State[][] dpState = new State[t.length()+1][s.length()+1];
        for (int i = 0; i < t.length() + 1; i++) {
            for (int j = 0; j < s.length() + 1; j++) {
                dpState[i][j] = new State();
            }
        }
        for (int i = 0; i < s.length() + 1; i++) {
            dpState[0][i].length = 0;
        }
        for (int i = 0; i < t.length() + 1; i++) {
            dpState[i][0].length = 0;
        }
        for (int i = 1; i < t.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                if (t.charAt(i-1) == s.charAt(j-1)){
                    dpState[i][j].length = dpState[i-1][j-1].length + 1;
                    dpState[i][j].direction = Direction.Diag;
                }else {
                    if (dpState[i-1][j].length > dpState[i][j-1].length){
                        dpState[i][j].length = dpState[i-1][j].length;
                        dpState[i][j].direction = Direction.Down;
                    }else {
                        dpState[i][j].length = dpState[i][j-1].length;
                        dpState[i][j].direction = Direction.Right;
                    }
                }
            }
        }
        int i = t.length();
        int j = s.length();
        while (i > 0 && j > 0){
            switch (dpState[i][j].direction){
                case Diag:
                    sb.insert(0, s.charAt(j-1));
                    i--;
                    j--;
                    break;
                case Down:
                    i--;
                    break;
                case Right:
                    j--;
                    break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String t = reader.readLine();
        System.out.println(lcs(s,t));
    }

    private static class State{
        int length;
        Direction direction;
    }

    private enum Direction{
        Right,
        Down,
        Diag
    }
}
