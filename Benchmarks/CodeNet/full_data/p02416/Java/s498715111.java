import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        while (true) {
            String str = br.readLine();
            if (str.equals("0")) {
                break;
            }
            for (int i = 0; i < str.length(); i++) {
                cnt += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}