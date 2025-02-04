import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] characters = {"a", "b", "c", "d", "e",
                               "f", "g", "h", "i", "j",
                               "k", "l", "m", "n", "o",
                               "p", "q", "r", "s", "t",
                               "u", "v", "w", "x", "y", "z"};
        
        // 26進数
        List<Integer> digits = new ArrayList<Integer>();

        N -= 1;
        while (26 <= N) {
            digits.add(N%26);
            N = N / 26 - 1;
        }
        digits.add(N);

        StringBuilder sb = new StringBuilder();
        for (int i = digits.size()-1; 0 <= i; i--) {
            sb.append(characters[digits.get(i)]);
        }

        System.out.println(sb.toString());
    }
}