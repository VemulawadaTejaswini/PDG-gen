import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String S = input.readLine();


        int APosition = 0;
        for (int i = 0; i < S.length(); i++) {
            if (isA(S.charAt(i))) {
                APosition = i;
                break;
            }
        }

        int ZPosition = S.length() - 1;
        for (int i = S.length() - 1; i >= 0; i--) {

            if (isZ(S.charAt(i))) {
                ZPosition = i;
                break;
            }
        }

        System.out.println(ZPosition-APosition+1);
    }

    private static boolean isA(char c) {
        return c == 'A';
    }

    private static boolean isZ(char c) {
        return c == 'Z';
    }
}