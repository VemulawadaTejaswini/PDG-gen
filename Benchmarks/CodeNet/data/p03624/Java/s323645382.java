import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine() + " ";
        char ans = 0;
        boolean b = true;
        for (char c = 'a'; c <= 'z'; c++) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == c) {
                    break;
                } else {
                    if (i == s.length() - 1) {
                        ans = c;
                        b = false;
                    }
                }
            }
            if (b == false)
                break;
        }

        if (b == false) {
            System.out.println(ans);
        } else {
            System.out.println("None");
        }
    }

}
