import com.sun.xml.internal.rngom.parse.compact.JavaCharStream;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    Scanner sc = new Scanner(System.in);

    void solve() {
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(String.valueOf(c), 0);
        }
        for (int i = 0; i < strArr.length; ++i) {
            if (map.containsKey(String.valueOf(Character.toLowerCase(strArr[i]))))
                map.put(String.valueOf(Character.toLowerCase(strArr[i])),
                        map.get(String.valueOf(Character.toLowerCase(strArr[i]))) + 1);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + " : " +
                    map.get(String.valueOf(Character.toLowerCase(c))));
        }
    }
}




