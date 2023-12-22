import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[26];
        while(sc.hasNextLine()) {
            char[] c = sc.nextLine().toCharArray();
            for (int i = 0, l = c.length; i < l; ++i) {
                char _c = c[i];
                if (97 <= _c && _c <= 122) ++a[_c - 'a'];
                else if (65 <= _c && _c <= 90) ++a[_c - 'A'];
            }
        }
        for (int i = 0; i < 26; ++i) System.out.printf("%c : %d\n", 'a' + i, a[i]);
    }

}