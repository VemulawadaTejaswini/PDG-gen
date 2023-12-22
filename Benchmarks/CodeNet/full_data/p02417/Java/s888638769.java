import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt[] = new int[26];
        String str;
        char c = 0;
        char c2 = 'a';

        while (null != (str = br.readLine())) {
            for (int i = 0; i < str.length(); i++) {
                str = str.toLowerCase();
                c = str.charAt(i);
                if (Character.isLowerCase(c)) {
                    for (int j = 0; j < cnt.length; j++) {
                        if (c == c2) {
                            cnt[j]++;
                            c2 = 'a';
                            break;
                        } else {
                            c2++;
                        }
                    }
                }
            }
        }
        
        for (int i = 0; i < cnt.length; i++) {
            System.out.println(c2 + " : " + cnt[i]);
            c2++;
        }
    }
}