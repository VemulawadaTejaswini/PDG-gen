import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();
        char ch[] = new char[str.length()];
        for (int i = 0; i <str.length(); i++)
            ch[i] = str.charAt(i);
        int cnt = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i == 0) {
                if (ch[i] == ch[i + 1])
                    ch[i] =(char)i;
                cnt++;
                break;
            }
            if (i == ch.length - 1) {
                if (ch[i] == ch[i - 1]) {
                    ch[i] = (char) i;
                    cnt++;
                    break;
                }
            }
            if (ch[i] == ch[i + 1] || ch[i] == ch[i - 1]) {
                ch[i] = (char) i;
                cnt++;
            }
        }
        if (ch[0] == ch[ch.length - 1])
            cnt++;
        System.out.println(cnt * k);

    }
}