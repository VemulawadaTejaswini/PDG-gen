import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        try {
            input = reader.readLine();
            char[] inputCharArray = input.toCharArray();
            String out = "";
            for(int i=0; i<inputCharArray.length; i++){
                out += inputCharArray[inputCharArray.length - 1 - i];
            }
            System.out.println(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}