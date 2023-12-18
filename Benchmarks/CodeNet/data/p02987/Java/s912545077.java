import java.util.*;

public class Main {
    long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'A']++;
        }
        int a = 0;
        for(int i = 0; i < 26; i++) {
            if(count[i] == 2) a++;
        }
        if(a == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        

    }
}