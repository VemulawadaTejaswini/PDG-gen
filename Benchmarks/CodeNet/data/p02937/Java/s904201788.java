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
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        for (int i = 0; i < s2.length(); i++) {

            String search = sb.toString();
            int index = search.indexOf(s2.charAt(i));
            if (index < 0) {
                sb.append(s1);
                index = sb.toString().indexOf(s2.charAt(i));
                search = sb.toString();
            }
            
            result += (index + 1);
            if (search.length() >= index + 1) {
                // search = search.substring(index + 1);
                sb = sb.delete(0, index + 1);
            }

        }

        return result;
    }

}
