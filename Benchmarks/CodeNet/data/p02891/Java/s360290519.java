import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int len = s.length();
        long k = in.nextLong();
        int cPerS = 0;
        boolean isAllSame = true;
        for(int i=1; i<len; i++) {
            if(s.charAt(i-1) != s.charAt(i)) {
                isAllSame = false;
                break;
            }
        }
        boolean isFinalCharReplaced = false;
        for(int i=1; i<len; i++) {
            if(s.charAt(i-1) == s.charAt(i)) {
                cPerS++;
                if(i==len-1) {
                    isFinalCharReplaced = true;
                }
                i++;
            }
        }
        long result = cPerS * k;
        if(isAllSame) {
            result = len * k / 2;
        }
        else if(len==1) {
            result = k/2;
        }
        else if(s.charAt(0) == s.charAt(s.length()-1) && !isFinalCharReplaced) {
            result += k-1;
        }
        System.out.println(result);
    }
}
