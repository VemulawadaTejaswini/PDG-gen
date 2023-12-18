import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(calc(s1, s2));
        }
    }

    public static int calc(String s1, String s2) {

        for (int i = 0; i < s2.length(); i++) {
            if (!s1.contains(String.valueOf(s2.charAt(i)))) {
                return -1;
            }
        }

        int result = 0;
        String search = s1;
        for (int i = 0; i < s2.length(); i++) {

            int index = search.indexOf(s2.charAt(i));
            if (index < 0) {
                search += s1;
                index = search.indexOf(s2.charAt(i));
            }
            result += index;
            search = search.substring(index);
        }
        return result + 1;
    }

}
