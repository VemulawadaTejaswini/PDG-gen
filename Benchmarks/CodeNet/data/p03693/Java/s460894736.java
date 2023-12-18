import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String in = br.readLine();
        String out = in;
        int left = 0;
        int right = 0;
        for(int i = 0; i < in.length(); i++) {
            if(i != 0) {
                i--;
            }
            while(in.charAt(i) == '(') {
                right++;
                if(i + 1 == in.length()) {
                    break;
                }
                i++;
            }
            while(in.charAt(i) == ')') {
                left++;
                if(i + 1 == in.length()) {
                    break;
                }
                i++;
            }
            if(left > right) {
                for(int j = 0; j < left - right; j++) {
                    out = "(" + out;
                }
            }
            if(left < right) {
                for(int j = 0; j < right - left; j++) {
                    out = out + ")";
                }
            }
            left = 0;
            right = 0;
        }
        System.out.println(out);
    }
}