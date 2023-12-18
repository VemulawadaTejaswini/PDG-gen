import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i=0; i<n; i++) {
            String si = in.next();
            s[i] = sortStr(si);
        }
        Arrays.sort(s);
        String prev = "";
        long c = 0;
        int dup = 0;
        for(int i=0; i<n; i++) {
            if(s[i].equals(prev)) {
                dup++;
                c += dup;
            }
            else {
                prev = s[i];
                dup = 0;
            }
        }
        System.out.println(c);
    }
    private static String sortStr(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        String result = new String(c);
        return result;
    }
}
