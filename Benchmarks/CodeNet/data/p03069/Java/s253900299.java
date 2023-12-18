import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int l = 0;
        int r = n-1;
        for (int i = 0; i < n; i++) {
            if (s[i] == '#') {
                l = i;
                break;
            }
        }

        for (int i = n-1; i >= 0; i--) {
            if (s[i] == '.'){
                r = i;
                break;
            }
        }

        int black = 0;
        int white = 0;
        for (int i = r; i >= l; i--) {
            if (s[i] == '.')
                white++;
            else
                black++;
        }
        
        System.out.println(Math.min(black, white));
    }
}
