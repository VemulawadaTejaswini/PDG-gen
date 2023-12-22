import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int n = sc.nextInt();
        boolean[] ary = new boolean[53];
        for (int i = 0; i < n; i++) {
            ary[convert(sc.next(), sc.nextInt())] = true;
        }
        
        for (int i = 1; i < 53; i++) {
            if (ary[i] == false) {
                String[] s = convert(i);
                System.out.println(s[0] + " " + s[1]);
            }
        }
    }
    
    public static int convert(String p, int n) {
        int res = 0;
        if (p.equals("H")) {
            res += 13;
        } else if (p.equals("C")) {
            res += 26;
        } else if (p.equals("D")) {
            res += 39;
        }
        
        return res + n;
    }
    
    public static String[] convert(int n) {
        String[] res = new String[2];
        if (0 < n && n <= 13) {
            res[0] = "S";
        } else if (13 < n && n <= 26) {
            res[0] = "H";
        } else if (26 < n && n <= 39) {
            res[0] = "C";
        } else if (39 < n && n <= 52) {
            res[0] = "D";
        }
        
        int i = (n%13 == 0) ? 13 : n%13;
        
        res[1] = new Integer(i).toString();
        return res;
    }
}