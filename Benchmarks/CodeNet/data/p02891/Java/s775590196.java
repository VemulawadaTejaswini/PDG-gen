import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        long k = in.nextLong();
        int cPerS = 0;
        for(int i=1; i<len; i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                cPerS++;
                i++;
            }
        }
        long result = cPerS * k;
        if(len==1) {
            result = k/2;
        }
        else if(s.charAt(0) == s.charAt(s.length()-1)) {
            if(s.charAt(len-2) != s.charAt(len-1)) {
                result += k-1;
            }
        }
        System.out.println(result);
    }
}
