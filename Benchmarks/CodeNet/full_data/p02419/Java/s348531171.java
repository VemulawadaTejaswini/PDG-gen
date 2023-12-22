import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.next();
            if (s.equals("END_OF_TEXT")) {
                break;
            }
            list.add(s.toLowerCase());
        }
        long sum = 0;
        for (String s : list) {
            if (s.equals(word)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}