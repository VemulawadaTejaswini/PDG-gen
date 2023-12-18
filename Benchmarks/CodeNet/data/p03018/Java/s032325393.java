import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char[] s = new char[n];
        for (int i = 0; i < n; i++) {
            s[i] = str.charAt(i);
        }
        
        long count = 0;
        
        for (int i = 0; i < n - 2; i++) {
            if (s[i] == 'A') {
                long kariCount = 0;
                while (true) {
                    if (i == n) {
                        count += kariCount;
                        break;
                    }
                    
                    if (i + 1 < n && s[i + 1] == 'A') {
                        kariCount++;
                        i++;
                        continue;
                    }
                    
                    if (i + 2 < n && s[i + 1] == 'B' && s[i + 2] == 'C') {
                        count += kariCount + 1;
                        kariCount = 0;
                        i += 2;
                        continue;
                    }
                    break;
                }
            }
        }
        
        System.out.println(count);
    }
}
