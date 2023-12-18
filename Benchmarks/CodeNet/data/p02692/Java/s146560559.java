import java.util.Scanner;

public class ABC166F {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); int a = scan.nextInt(); int b = scan.nextInt(); int c = scan.nextInt();
        scan.nextLine();
        char[] ans = new char[n];
        for (int i = 0; i < n; ++i) {
            String s = scan.nextLine();
            if (s.charAt(0)=='A' && s.charAt(1)=='B') {
                if (a > b) {
                    a--;
                    b++;
                    ans[i] = 'B';
                }
                else {
                    a++;
                    b--;
                    ans[i] = 'A';
                }
            }
            else if (s.charAt(0)=='A' && s.charAt(1)=='C') {
                if (a > c) {
                    a--;
                    c++;
                    ans[i] = 'C';
                }
                else {
                    a++;
                    c--;
                    ans[i] = 'A';
                }
            }
            else if (s.charAt(0)=='B' && s.charAt(1)=='C') {
                if (b > c) {
                    b--;
                    c++;
                    ans[i] = 'C';
                }
                else {
                    b++;
                    c--;
                    ans[i] = 'B';
                }
            }
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
        for (var e: ans) System.out.println(e);
    }
}