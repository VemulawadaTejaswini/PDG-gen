
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder builder;
            String line = reader.readLine();
            builder = new StringBuilder(line);
            for (int i = 0; i < line.length(); i++) {
                char word = builder.charAt(i);
                if (Character.isLowerCase(word) == true) {
                    System.out.print(Character.toUpperCase(word));
                } else if (Character.isUpperCase(word) == true) {
                    System.out.print(Character.toLowerCase(word));
                } else {
                    System.out.print(word);
                }
            }
        } catch (IOException e) {
            
        }
        System.out.println("");
    }
}