import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] n = new int[s.length()];
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            n[i] = (int)(s.charAt(s.length() - i - 1) - '0');
            if(i == s.length() - 1) sum += n[i] - 1;
            else sum += 9;
        }
        System.out.println(sum);
        sc.close();
    }

}
