import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        long result = 0;
        boolean[] isAnagram = new boolean[n];
        for (int i = 0; i < s.length; i++) {
            if (isAnagram[i]) {
                continue;
            }
            int midResult = 0;
            for (int j = i + 1; j < s.length; j++) {
                if (isAnagram[j]) {
                    continue;
                }
                if (anagramChecker(s[i], s[j])) {
                    isAnagram[j] = true;
                    midResult++;
                }
            }
            for (int j = midResult; j > 0; j--) {
                result += j;
            }
        }
        System.out.println(result);
        sc.close();
    }

    public static boolean anagramChecker(String str1, String str2) {
        char[] c = str1.toCharArray();
        Arrays.sort(c);
        str1 = new String(c);
        c = str2.toCharArray();
        Arrays.sort(c);
        str2 = new String(c); 
        return str1.equals(str2);
    }
}