import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long a, b = 0;
        long n = Long.parseLong(br.readLine());
        int digits, mindigits = 11;
        
        for (a = 1; a <= Math.sqrt(n); a++) {
            if (n % a == 0) {
                b = n / a;
                digits = String.valueOf(Math.max(a, b)).length();
                if (digits  < mindigits) mindigits = digits;
            }
        }
        
        System.out.println(mindigits);
    }
}
