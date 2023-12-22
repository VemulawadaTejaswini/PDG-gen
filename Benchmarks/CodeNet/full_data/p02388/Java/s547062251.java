import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String a[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getAnswer(n));
    }

    static long getAnswer(int n) {
        int a = 1;
        for (int i = 1; i <= 2; i++) {
            a *= n;
        }
        return a * n;
    }
    
}
