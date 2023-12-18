import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Atcoder111B {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        char[] digits = input.readLine().toCharArray();
        int value  = Integer.parseInt(digits[0] + "");
        if (digits[0] >= digits[1] && digits[0] >= digits[2]) {
            System.out.println(value + "" + value + "" + value);
        }else{
            value++;
            System.out.println(value + "" + value + "" + value);
        }
    }
}
