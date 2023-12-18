import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String args[]) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            final List<String> inputLines =
                    br.lines().limit(4).collect(Collectors.toList());


            final int length = Integer.valueOf(inputLines.get(0));
            final String wordA = inputLines.get(1);
            final String wordB = inputLines.get(2);
            final String wordC = inputLines.get(3);

            int count = 0;
            for (int i = 0; i < length; i++) {

                char a = wordA.charAt(i);
                char b = wordB.charAt(i);
                char c = wordC.charAt(i);

                if (a == b && b == c){
                    continue;
                } else if (a == b || b == c || a == c) {
                    count++;
                } else {
                    count += 2;
                }
            }

            output(String.valueOf(count));
        }

    }

    private static void output(String message){
        System.out.println(message);
    }
}
