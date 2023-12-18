import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int prev = 0;
        int min = Integer.MAX_VALUE;
        boolean[] isSameDirection = new boolean[n];
        for(int i = 0; i < n; i++) {
            char c = s.charAt(i);
            isSameDirection[i] = c == 'W';
        }
        for(int i = 1; i < n; i++) {
            if(isSameDirection[i]) prev++;
        }
        for(int i = 1; i < n; i++) {
            int count = prev;
            if(s.charAt(i) == 'E') count--;
            if(s.charAt(i-1) == 'W') count++;
            min =  Math.min(min, count);
        }
        System.out.println(min);
    }
}