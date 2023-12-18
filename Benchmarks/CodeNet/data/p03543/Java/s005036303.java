import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(), pocitadlo = 0;
        String answer = "No";

        String s = Integer.toString(i);

        if(i >= 1000 && i <= 9999) {

            for (int x = 0; x < s.length(); x++) {
                char c = s.charAt(x);

                for (int y = 0; y < s.length(); y++)
                    if (s.charAt(y) == c) pocitadlo++;

                if (pocitadlo >= 3) {
                    answer = "Yes";
                    break;
                }
                pocitadlo = 0;
            }

            System.out.println(answer);
        }
    }
}
