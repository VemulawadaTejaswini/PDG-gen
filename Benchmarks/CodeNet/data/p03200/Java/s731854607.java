import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char[] chars = S.toCharArray();
        int max = 0;
        while(true) {
            int currentMax = max;
            for(int i=0; i<chars.length-1; i++) {
                if(chars[i] == 'B' && chars[i+1] == 'W') {
                    max ++ ;
                    chars[i] = 'W';
                    chars[i+1] = 'B';
                }else if(chars[i] == 'W' && chars[i+1] == 'W') {
                    i++;
                }
            }
            if (currentMax == max) {
                break;
            }
        }
        System.out.println(max);
    }
}