import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = "";
        
        int degree = 0;
        for (int i = 0;; i++) {
            //System.out.println("1");
            if (n >= 0) {
                if (Math.pow(-2, i) > n) {
                    degree = i-2;
                    break;
                }
            }
            else {
                if (Math.pow(-2, i) < n) {
                    degree = i-2;
                    break;
                }
            }
        }
        
        for (int i = degree; i >= 1; i--) {
            if (n >= 0)
                if (n - Math.pow(-2, i) >= 0 && Math.pow(-2, i) > 0) {
                    n -= Math.pow(2, i);
                    s += "1";
                }
                else s += "0";
            else {
                if (n - Math.pow(-2, i) <= 0 && Math.pow(-2, i) < 0) {
                    n -= Math.pow(2, i);
                    s += "1";
                }
                else s += "0";
            }
        }
        
        if (n%2==0) s+="0";
        else s+="1";
        System.out.println(s);
    }
}



