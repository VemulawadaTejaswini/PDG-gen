import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    a++;
                    break;
                case 'b':
                    b++;
                    break;
                    case 'c':
                    c++;
                    break;
            }
        }
        int[] array = {a, b, c};
        Arrays.sort(array);
        int max = array[2];
        switch (s.length()) {
            case 1:
                System.out.println("Yes");
                return;
            case 2:
                System.out.println(max == 1 ? "Yes" : "No");
                return;
            default:
                int limit = s.length() / 3;
                if (s.length() % 3 > 0) {
                    limit++;
                }
                System.out.println(max <= limit ? "YES" : "No");
        }
    }
}