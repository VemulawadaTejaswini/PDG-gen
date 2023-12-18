import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int index = 0;
        boolean isWhat = true;
        if (s.length() != t.length()) {
            isWhat = false;
        }
        
        if (isWhat) {
            for (int i = 0; i < s.length(); i++) {
                index = s.indexOf(t.charAt(0), i);
              	if (index == -1) {
                    isWhat = false;
                    break;
                }
              	
                isWhat = check(s, t, index);
                if (isWhat == true)   break;
            }
        }
        
        System.out.println(isWhat ? "Yes" : "No");
    }

    public static boolean check(String s, String t, int index) {
        int len = s.length();
        boolean re = true;
        int cnt = index;
        for (int i = 0; i < len; i++) {
            if (cnt >= len)   cnt = 0;
            if (s.charAt(cnt++) != t.charAt(i)) {
                re = false;
                break;
            }
        }
        return re;
    }
}
