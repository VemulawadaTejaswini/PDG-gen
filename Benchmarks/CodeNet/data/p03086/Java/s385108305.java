import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int ans = 0;
        int count = 0;
        for (Character c : s.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                count++;
            } else {
                if (ans < count) {
                    ans = count;
                    count = 0;
                }
            }
        }

        System.out.print(Math.max(ans, count));
    }

}