import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        List<String> list = new ArrayList<>(Arrays.asList("a", "i", "u", "e", "o"));
        String result = "consonant"; 
        for (String s : list) {
            if (c.contains(s)) result = "vowel";
        }
        System.out.println(result);
    }
}
