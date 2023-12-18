import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        byte[] s = scan.next().getBytes();
        int m = s.length / 2 + (s.length & 1) - 1;
        for (int i = 0; i < m + 1; i++) {
            if(s[m-i] != s[m] || s[m+i] != s[m]) {
                System.out.println(m + i);
                return;
            }
        }

    }
}
