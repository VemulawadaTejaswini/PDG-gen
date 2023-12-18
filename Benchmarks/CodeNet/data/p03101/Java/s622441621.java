import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader stdR = new BufferedReader(new InputStreamReader(System.in));
        String[] str = stdR.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int W = Integer.parseInt(str[1]);
        str = stdR.readLine().split(" ");
        int h = Integer.parseInt(str[0]);
        int w = Integer.parseInt(str[1]);
        System.out.println((H - h) * (W - w));
    }
}
