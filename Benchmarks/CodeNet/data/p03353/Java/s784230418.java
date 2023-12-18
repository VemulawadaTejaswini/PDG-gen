import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        
        String sub;
        Set<String> subs = new TreeSet(); 
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j <= s.length(); j++) {
                if (j == s.length()) {
                    sub = s.substring(i);
                }
                else {
                    sub = s.substring(i, j);
                }
                
                subs.add(sub);
            }
        }
        
        
        String ans = "";
        int count = 1;
        for (String temp : subs) {
            //System.out.println(temp);
            if (count == k) ans = temp;
            count++;
        }
        System.out.println(ans);
    }
}
