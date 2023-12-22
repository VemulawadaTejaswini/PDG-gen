import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by martin-d28jp-love on 15/04/01.
 */
public class Main {

    public static void main(String[] args) {
        List<String> input = input();
//        List<String> input = mockuop();

        int inputLength = Integer.valueOf(input.get(0));
        int maxSubtruction = -Integer.MAX_VALUE;
        int beforeSubtructionRi = Integer.MAX_VALUE;
        for (int i = 1; i < inputLength; i++) {
            int Ri = Integer.valueOf(input.get(i));
            if (beforeSubtructionRi < Ri) {
                continue;
            }
            for (int j = i + 1; j <= inputLength; j++) {
                int Rj = Integer.valueOf(input.get(j));
                if (Rj - Ri > maxSubtruction) {
                    maxSubtruction = Rj - Ri;
                    beforeSubtructionRi = Ri;
                }
            }
        }

        System.out.println(maxSubtruction);
    }

    public static List<String> mockuop() {
        List<String> input = Arrays.asList(
                "6",
                "5",
                "12",
                "11"
        );
        return input;
    }
    public static List<String> input() {
        Scanner in = new Scanner(System.in);
        List<String> input = new ArrayList<String>();
        while(in.hasNext()) {
            String buf = in.nextLine();
            input.add(buf);
        }
        in.close();
        return input;
    }
}