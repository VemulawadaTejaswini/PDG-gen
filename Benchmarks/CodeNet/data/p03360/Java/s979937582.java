import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line[] = br.readLine().split(" ");
        int a = Integer.parseInt(line[0]);
        int b = Integer.parseInt(line[1]);
        int c = Integer.parseInt(line[2]);
        int k = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < k; i++) {
            if (a >= b && a >= c) a = a * 2;
            else if (b >= a && b >= c) b = b * 2;
            else if (c >= a && c >= b) c = c * 2;
        }
        System.out.println(a + b + c);
    }
}
