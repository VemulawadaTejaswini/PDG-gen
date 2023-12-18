import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());

        char c = s.charAt(k - 1);
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            if(s.charAt(i) == c) sb.append(s.charAt(i));
            else sb.append('*');
        }

        System.out.println(sb);

        br.close();
    }
}