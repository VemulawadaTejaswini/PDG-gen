import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class atcoder11_18 {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String line = buffer.readLine();
        int x = Integer.parseInt(line);

        int mod1 = x % 10;
        int x1 = x / 10;
        int mod2 = x1 % 10;
        int x2 = x1 / 10;
        int mod3 = x2 % 10;
        int x3 = x2 / 10;
        int mod4 = x3 % 10;

        boolean flag = false;

        if (mod1 == mod2 && mod2 == mod3){
          flag = true;
        } else if (mod2 == mod3 && mod3 == mod4){
          flag = true;
        }

        if(flag){
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }

}
