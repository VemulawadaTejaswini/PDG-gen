import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(subStringCount(s));
        System.out.println((subStringCount(s) % (1000000007)));

    }

    public static int subStringCount(String string) {
        int size = 1, count = 0;
        while (size <= string.length()) {
            for (int j = 0; j <= string.length() - size; j++) {
                String sub = string.substring(j, j + size);
                if (!isDuplicate(sub)) {
                    count++;
                    System.out.println(sub);
                }
                for (int i = 1; i < string.length() - size - 1; i++) {
                    String sub2 = string.substring(1, i) + string.substring(i + size);
                    if (!isDuplicate(sub2)) {
                        count++;
                        System.out.println("2:" + sub2);
                    }
                }
            }
            size++;
        }
        return count;
    }

    public static boolean isDuplicate(String string) {
        boolean[] exist = new boolean['z' - 'a'];
        for (int i = 0; i < string.length(); i++) {
            char c = (char) (string.charAt(i) - 'a');
            if (exist[c])
                return true;
            exist[c] = true;
        }
        return false;
    }

}