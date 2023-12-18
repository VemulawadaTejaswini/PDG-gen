import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long res = 0;
        long sofar = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == 'W') {
                res += sofar;
            } else {
                sofar += 1;
            }
        }
        System.out.println(res);
    }
}
