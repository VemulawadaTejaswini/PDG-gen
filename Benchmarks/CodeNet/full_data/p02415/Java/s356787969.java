import java.io.*;
  
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = input.readLine()) != null) {
            char[] line_chars = line.toCharArray();
            int line_len = line_chars.length;
            for (int i = 0; i < line_len; i++) {
                char ch = line_chars[i];
                int amount = 0;
                if (Character.isUpperCase(ch))
                    amount = 32;
                else if (Character.isLowerCase(ch))
                    amount = -32;
                line_chars[i] += amount;
            }
            System.out.println(new String(line_chars));
        }
    }
}