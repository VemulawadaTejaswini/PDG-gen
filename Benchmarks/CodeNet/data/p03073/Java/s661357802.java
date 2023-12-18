import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        String s1 = new String();
        String s2 = new String();

        for (int i = 0; i < s.length()/2; i++) {
                s1 += "01";
                s2 += "10";
        }

        if(s.length()%2 != 0) {
            s1 += "0";
            s2 += "1";
        }
        Long count_s1 = 0L;
        Long count_s2 = 0L;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == s1.charAt(i)) count_s1++;
            if(s.charAt(i) == s2.charAt(i)) count_s2++;
        }

        Long min = Math.min(count_s1, count_s2);

        System.out.println(min);
    }

}
