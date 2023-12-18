import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        List<Character> output = new ArrayList<Character>();
        for (char c : s.toCharArray()) {
            if (c != 'B') {
                output.add(c);
            } else {
                if (output.size() != 0) {
                    output.remove(output.size() - 1);
                }
            }
        }

        String ans = output.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(ans);
    }
}