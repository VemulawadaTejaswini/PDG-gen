import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int num;
        num = cin.nextInt();

        String temp;
        HashMap<String, Integer> vote = new HashMap<>();
        for (int i = 0; i < num; i++) {
            temp = cin.next();
            vote.compute(temp, (k, v) -> v == null ? 1 : v + 1);
        }

        int max = Collections.max(vote.values());

        ArrayList<String> strings = new ArrayList<>();
        for (HashMap.Entry<String, Integer> entry : vote.entrySet()) {
            if (max == entry.getValue()) {
                strings.add(entry.getKey());
            }
        }

        Collections.sort(strings);

        for (String s: strings) {
            System.out.println(s);
        }
    }
}
