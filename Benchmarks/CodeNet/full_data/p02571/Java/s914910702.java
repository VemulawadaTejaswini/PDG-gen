import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String complete = sc.nextLine();
        String part = sc.nextLine();
        System.out.println(solve(complete, part));
    }

    public static int solve(String complete, String part) {
        if (part.length() > complete.length()) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < (complete.length() - part.length())+ 1; i++) {
            String substr = complete.substring(i, i + part.length());
            int value = calc(substr, part);
            if(value > count){
                count = value;
            }
        }
        return (part.length() - count);
    }

    public static int calc(String substr, String part) {
        int similar = 0;
        for(int i = 0; i < substr.length(); i++) {
            char ch1 = substr.charAt(i);
            char ch2 = part.charAt(i);
            if(ch1 == ch2) {
                similar++;
            }
        }
        return similar;
    }
}
