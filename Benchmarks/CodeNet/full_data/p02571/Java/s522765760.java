import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] c1 = str.toCharArray();
        str = sc.next();
        char[] c2 = str.toCharArray();
        
        int min = 100000;
        for (int i = 0; i < c1.length - c2.length+1; i++) {
            int now = 0;
            for (int j = 0; j < c2.length; j++) {
                if (c1[j+i] != c2[j]) now++;
            }
            
            min = Math.min(min, now);
        }
        System.out.println(min);
    }
}
