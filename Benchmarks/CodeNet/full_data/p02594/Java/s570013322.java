import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
class Main {
  public static void main(String[] args) {
    try {
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = stdin.readLine()) != null) {
            Integer value = Integer.valueOf(line);
            if (value>=30) {
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
        }

    } catch(Exception e) {
    }
   
  }
}