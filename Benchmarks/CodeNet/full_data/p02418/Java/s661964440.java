import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String p = sc.next();
        int cnt = 0;
        int j = 0;
        int i = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == p.charAt(j)) {
                j++;
                
            }else if(s.charAt(i) == p.charAt(0)){
                 j = 1;       
                        } else {
                j = 0;
            }
            if (j == p.length()) {
                System.out.println("Yes");
                break;
            }

            if (i == s.length() - 1) {
                i = -1;
                cnt++;
            }
            if (cnt == 2) {
                System.out.println("No");
                break;
            }
        }

    }
}