import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int S = Integer.valueOf(line);
        int h = S/3600;
        int m = S%3600/60;
        int s = S%60%60;
        String time = String.format("%s:%s:%s",h,m,s);
        System.out.println(time);
    }
}