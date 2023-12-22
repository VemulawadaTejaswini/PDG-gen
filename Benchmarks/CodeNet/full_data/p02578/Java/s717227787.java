import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        long size = Long.parseLong(in.readLine());
        String[] str = in.readLine().split(" ");
        long num1 = 0;
        long num2 = 0;
        long step = 0;
        long res = 0;

        for(int i=0; i < size-1; i++) {
        	num1 = Long.parseLong(str[i]) + step;
        	num2 = Long.parseLong(str[i+1]);

        	if(num1 > num2) {
        		step = num1 - num2;
        		res += step;
        	}else {
        		step = 0;
        	}
        }

        System.out.println(res);

    }
}