
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
            if(bReader == null)
                break;
            String str = bReader.readLine();
            String[] editedStr = str.split(" ");
            Arrays.sort(editedStr);
            System.out.println(FindGCD(Integer.parseInt(editedStr[0]), Integer.parseInt(editedStr[1])) + " " + FindLCM(Integer.parseInt(editedStr[0]), Integer.parseInt(editedStr[1])));
        }
    }

    public static int FindGCD(int a, int b) {
        int r = a % b;
        while (r > 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public static int FindLCM(int a, int b) {
        return (a * b) / FindGCD(a, b);
    }
}