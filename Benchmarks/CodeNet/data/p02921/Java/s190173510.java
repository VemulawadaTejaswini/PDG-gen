import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        String t = stdIn.next();
        int count = 0;
        for(int i = 0;i<s.length();i++) {
            if(s.charAt(i) == t.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
        }
}