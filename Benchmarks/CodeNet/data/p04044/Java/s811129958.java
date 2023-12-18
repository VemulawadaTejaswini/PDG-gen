import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        String[] words = new String[a];
        for (int i = 0; i < a; i++) {
            words[i] = sc.next();
        }
        Arrays.sort(words);
        String result = "";
        for (String tmp : words) {
            result += tmp;
        }
        System.out.println(result);
    }
}
