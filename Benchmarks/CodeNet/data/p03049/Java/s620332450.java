import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int completed = 0;
        int bigin = 0;
        int end = 0;
        for(int i = 0; i < n; i++) {
            char[] s = br.readLine().toCharArray();
            int len = s.length;
            if(s[0] == 'B') bigin++;
            if(s[len - 1] == 'A') end++;
            for(int j = 0; j < len - 1; j++) {
                if(s[j] == 'A' && s[j + 1] == 'B') completed++;
            }
        }

        if(n % 2 == 0 && Math.min(bigin, end) == n / 2) System.out.println(completed + n / 2 - 1);
        else System.out.println(completed + Math.min(bigin, end));
        
        br.close();
    }
}