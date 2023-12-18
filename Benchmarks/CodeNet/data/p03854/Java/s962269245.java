import java.util.*;

public class Main {
    public static void main(String[] args) {
        String res = "NO";
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        sc.close();

        String[] words = { "maerd", "remaerd", "esare", "resare" };
        StringBuilder judgeString = new StringBuilder();

        int startIndex = S.length() - 1;

        for (int i = startIndex; i >= 0; i--) {
            if (i == startIndex) {
                judgeString.append(S.substring(i));
            } else {
                judgeString.append(S.substring(i, i + 1));
            }
            for (int k = 0; k < words.length; k++) {
                if (words[k].equals(judgeString.toString())) {
                    judgeString.setLength(0);
                    if (i == 0) {
                        res = "YES";
                    }
                    break;
                }
            }
        }
        System.out.println(res);
    }
}