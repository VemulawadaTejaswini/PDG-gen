import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String[] str = in.readLine().split("");
        double num = 0;
        double res = 0;

        for(int i=0; i < str.length; i++) {
        	num = num*10 + Integer.parseInt(str[i]);
        	if(i % 5 == 0 ) {
        		res += num % 9;
        		num = 0;
        	}
            else if(i == str.length-1){
        		res += num % 9;
            }
        }
        if(res % 9 == 0) {
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }

    }
}