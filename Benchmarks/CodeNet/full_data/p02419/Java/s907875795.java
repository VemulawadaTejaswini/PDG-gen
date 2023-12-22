
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            char[] word = reader.readLine().toCharArray();
            int count = 0;
            int Wcount;
            while (true) {
                char[] context = reader.readLine().toCharArray();
                if (String.valueOf(context).equals("END_OF_TEXT")) {
                    break;
                }
                for (int i = 0; i < context.length; i++) {
                    Wcount = 0;
                    // word count
                    for (int j = 0; j < word.length; j++) {
                        // ?????????????¶??????????????????????
                        if (j + i == context.length) {
                            break;
                        } else {
                            if (word[j] == context[j + i]) {
                                Wcount++;
                            }
                        }
                        // ??????????????????
                        if (Wcount == word.length) {
                            if (context.length > word.length) {
                                if (context[j + i + 1] == ' ' || j+i+1 > context.length) {
//                                  Wcount = 0;
                                    count++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            System.out.println(count);

        } catch (IOException e) {

        }
    }
}