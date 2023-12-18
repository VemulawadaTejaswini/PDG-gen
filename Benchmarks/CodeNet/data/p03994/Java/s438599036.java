import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int k = sc.nextInt();
        for (int i = 0 ; i < n ; i++) {
            if (k > 'z' - s[i]) {
                k -=  'z' - s[i] + 1;
                s[i] = 'a';
            }
        }
        char[] al = new char[26];
        char c = 'a';
        for (int i = 0 ; i < 26; i++) {
            al[i] = c++;
        }
        s[n - 1] = al[s[n - 1] - 'a' +  k % 26];
        for (int i = 0 ; i < n ; i++) {
            System.out.print(s[i]);
        }
    }

}