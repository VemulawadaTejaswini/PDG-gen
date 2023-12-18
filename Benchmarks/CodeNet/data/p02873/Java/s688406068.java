import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        char c[] = str.toCharArray();
        
        long answer = 0;
        int count = 0;
        char now = '<';
        int left = 0;
        int right = 0;
        
        for (int i = 0; i < n; i++) {
            if (now == '<') {
                if (c[i] == '<') {
                    left++;
                } else {
                    now = '>';
                    right = 1;
                }
            } else {
                if (c[i] == '<') {
                    if (left > right) {
                        right--;
                    } else {
                        left--;
                    }
                    
                    while (left > 0) {
                        answer += left;
                        left--;
                    }
                    while (right > 0) {
                        answer += right;
                        right--;
                    }
                    now = '<';
                    left = 1;
                } else {
                    right++;
                }
            }
        }
        
        
        
        if (left > right) {
            right--;
        } else {
            left--;
        }
        
        while (left > 0) {
            answer += left;
            left--;
        }
        while (right > 0) {
            answer += right;
            right--;
        }
        
        System.out.println(answer);
    }
}
