import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String s = sc.next();
            if(s.length() == 1 && s.charAt(0) == '0') break;
            int sum = 0;
            for(int i = 0; i < s.length(); i++) {
                int x = s.charAt(i) - 48;
                sum += x;
            }
            System.out.println(sum);
        }
    }
}
