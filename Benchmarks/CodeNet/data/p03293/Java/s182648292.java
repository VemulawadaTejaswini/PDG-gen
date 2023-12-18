import java.util.HashSet;
import java.util.Set;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        String line2 = br.readLine();
        boolean ans = true;
        boolean next = false;
        int x = 0;
        
        for (int i = 0; i < line1.length(); i++) {
            if (line1.charAt(0) == line2.charAt(i)) {
                next = true;
                x = i;
                break;
            }
        }
        
        if (next) {
            for (int j = 0; j < line1.length(); j++) {
                if (x >= line1.length())x -= 5;
                if (line1.charAt(j) == line2.charAt(x)) {
                    x++;
                    continue;
                }
                else {
                    ans = false;
                    break;
                }
            }
        }
        else ans = false;
        System.out.println(ans?"Yes":"No");
    }
}
