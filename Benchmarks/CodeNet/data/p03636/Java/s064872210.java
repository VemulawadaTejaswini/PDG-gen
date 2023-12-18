import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String btw = str.substring(1, str.length() - 1);
        System.out.println(str.substring(0, 1) + btw.length() + str.substring(str.length() - 1, str.length()));
    }

}
