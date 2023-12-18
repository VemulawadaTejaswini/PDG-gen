import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        //Scanner scanner = new Scanner(System.in);
        String str = scanner.readLine();

        Integer n = Integer.parseInt(scanner.readLine());
        for (int i = 0; i < n; i ++){
            String[] s1 = scanner.readLine().split(" ");
            if (s1[0].equals("1"))
                str = new StringBuffer(str).reverse().toString();
            else if (s1[0].equals("2")){
                if (s1[1].equals("1"))
                    str = s1[2] + str;
                else if (s1[1].equals("2"))
                    str = str + s1[2];
            }
        }
        System.out.println(str);
    }
}
