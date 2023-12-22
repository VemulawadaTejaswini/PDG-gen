import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Pattern pattern = Pattern.compile(br.readLine());

        String word = "", input;
        int count = 0;
        while (!(input = br.readLine()).equals("END_OF_TEXT")) {
            word += input;
        }

        Matcher matcher = pattern.matcher(word);
        while (matcher.find()) {
            count++;
        }
        bw.append(count + "");
        bw.flush();
    }


}
