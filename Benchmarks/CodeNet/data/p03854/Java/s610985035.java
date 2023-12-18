import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        String s = sc.next();
        List<String> words = Arrays.asList("dream", "erase", "dreamer", "eraser");

        String tmp = s;
        while (true) {
            String tmp2 = tmp;
            for (String word : words) {
                if (tmp.endsWith(word)) {
                    tmp = tmp.substring(0, tmp.length() - word.length());
                    break;
                }
            }

            if (tmp.equals("") || tmp2.equals(tmp)) {
                break;
            }
        }
        String result = "NO";
        if (tmp.equals("")) {
            result = "YES";
        }


        System.out.println(result);
    }
}