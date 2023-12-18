import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m;
        int r = 0;
        try {
            String str = reader.readLine();
            r = Integer.parseInt(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m = (int)Math.pow(r,2);
        System.out.println("" + m);
    }
}