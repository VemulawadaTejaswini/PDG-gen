import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        String str = readLineStandardInput();
        char[] S = str.toCharArray();
        int plus = 0;
        for(char s: S){
            if(s == '+'){
                plus += 1;
            }
        }
        int minus = 4 - plus;
        int res = plus - minus;
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