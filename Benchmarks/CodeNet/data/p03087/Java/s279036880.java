import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        int q = i(scanner.next());
        String s = scanner.next();
        for (int i = 0; i < q; i++) {
            String sub = s.substring(i(scanner.next())-1, i(scanner.next()));
            char r = 0, c;
            int count = 0;
            for (int j = 0; j < sub.length(); j++) {
                c = sub.charAt(j);
                if(r == 'A' && c == 'C')
                    count++;
                r = c;
            }
            System.out.println(count);
        }
    }

    public static int i(String str) {
        return Integer.parseInt(str);
    }
}