import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exec(args);
    }

    public static void exec(String[] args) {
        String str = readLineStandardInput();
        int N = Integer.parseInt(str);
        if(N == N / 2 * 2){
            System.out.println(N);
        }
        else {
            System.out.println(N  * 2);
        }
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }
}
