import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int k = Integer.parseInt(br.readLine());
        
        String sub;
        Set<String> subs = new HashSet(); 
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
        
        List<String> list = new ArrayList<>(subs);
        Collections.sort(list);
        
        
        System.out.println(list.get(k-1));
    }
}
