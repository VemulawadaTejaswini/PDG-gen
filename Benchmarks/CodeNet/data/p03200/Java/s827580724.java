import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] chars = S.toCharArray();
        int max = 0;
        int flag = 1;
        while(flag == 1) {
            int currentMax = max;
            for(int i=0; i<chars.length-1; i++) {
                if(chars[i] == 'B' && chars[i+1] == 'W') {
                    max ++ ;
                    chars[i] = 'W';
                    chars[i+1] = 'B';
                }
            }
            if (currentMax == max) {
                flag = 0;
            }
        }
        System.out.println(max);
    }
}