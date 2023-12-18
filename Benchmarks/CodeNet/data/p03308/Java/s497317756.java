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
        str = readLineStandardInput();
        String[] Astr = str.split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < Astr.length; i++) {
            int tmp = Integer.parseInt(Astr[i]);
            min = min > tmp ? tmp : min;
            max = max < tmp ? tmp : max;
        }
        int res = max - min;
        System.out.println(res);
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
