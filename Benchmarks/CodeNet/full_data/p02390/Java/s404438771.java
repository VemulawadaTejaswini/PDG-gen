import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int num = Integer.parseInt(line);
        int sec = num % 60;
        int min = 0;
        int hour = 0;
        num = Math.floor(num / 60);
        if (num > 0) {
            min = num % 60;
            num = Math.floor(num / 60);
            if (num > 0) {
                hour = num % 60;
            }
        }

        System.out.println(String.format("%d:%d:%d", hour, min, sec);
    }
}