import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        char c[] = str.toCharArray();
        
        // set: 英小文字の出現位置
        TreeSet[] set = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            set[i] = new TreeSet<Integer>();
        }
        for (int i = 0; i < n; i++) {
            char chr = c[i];
            set[chr - 'a'].add(i);
        }
        
        int query = sc.nextInt();
        
        while (query-- > 0) {
            int type = sc.nextInt();
            
            if (type == 1) {
                int index = sc.nextInt() - 1;
                char chr = c[index];
                char chr2 = (sc.next()).charAt(0);
                set[chr - 'a'].remove(index);
                set[chr2 - 'a'].add(index);
            } else {
                int start = sc.nextInt() - 1;
                int end = sc.nextInt() - 1;
                
                // count: start - end区間内にある英小文字の種類数
                int count = 0;
                for (int i = 0; i < 26; i++) {
                    if (set[i].ceiling(start) == null) {
                        
                    } else if ((int)set[i].ceiling(start) <= end) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
        
    }
}