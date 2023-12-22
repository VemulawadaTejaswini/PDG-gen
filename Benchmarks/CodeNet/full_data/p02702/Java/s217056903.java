import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        long ans = 0;

        for (int i = 0; i < s.length() - 4; i++) {
            long threeC = 0;
            for (int j = i; j <= i + 3; j++) {
                threeC += Integer.parseInt(s.substring(j, j+1));
            }
            for (int j = i + 5; j <= s.length(); j++) {
                threeC += Integer.parseInt(s.substring(j - 1, j));
                threeC %= 3;
                if (threeC != 0) {
                    continue;
                }
                if (isMultiple(s.substring(i, j), 10, 673)) {
                    ans++;
                    j += 4;
                }
            }
        }
        System.out.println(ans);
    }

    static boolean isMultiple (String s, int base, int m) {
        int temp = 0;
        for (int i=0; i<s.length(); i++) {
            temp = (temp*base+Character.getNumericValue(s.charAt(i)))%m;
        }
        if (temp==0) {return true;}
        return false;
    }
}