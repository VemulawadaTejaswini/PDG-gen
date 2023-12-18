import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeFes1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String word;

        while((line = br.readLine()) != null && !line.isEmpty() && line.length() > 3) {
            word = line.substring(0, 4);
            if (word.equals("YAKI")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        System.out.println("No");

    }
}