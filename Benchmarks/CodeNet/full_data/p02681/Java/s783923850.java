import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String S = "";
        String T = "";
        try {
            S = reader.readLine();
            T = reader.readLine();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (T.startsWith(S)) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}