import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringBuilder sb = new StringBuilder(br.readLine());
            System.out.println(sb.reverse().toString());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}