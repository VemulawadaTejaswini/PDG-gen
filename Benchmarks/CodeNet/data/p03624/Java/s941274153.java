import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean[] a = new boolean[26];
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        for (int i = 0; i < s.length(); i++) {
            a[(int)s.charAt(i)-97] = true;
        }
        
        String ans = "None";
        for (int i = 0; i < s.length(); i++) {
            if (a[i] == false) {
                ans = String.valueOf(chars[i]);
                break;
            }
        }
        System.out.println(ans);
    }
}
