import java.util.Scanner;

class B {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final char[] S = sc.next().toCharArray();
        int cnt = 0;
        for(char c : S)
            if(c == 'o')
                cnt++;
        System.out.println(15 - S.length + cnt >= 8 ? "YES" : "NO");
    }
}
public class Main {
    public static void main(String...args) {
        B.main();
    }
}
