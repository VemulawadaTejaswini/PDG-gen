import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String word;
        line = br.readLine();
        if(line.length() > 3 && line != null && !line.isEmpty()) {
                word = line.substring(0, 4);
                if (word.equals("YAKI")) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
        }
        else{
            System.out.println("No");
        }

    }
}