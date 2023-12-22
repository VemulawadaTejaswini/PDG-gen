import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String W = sc.next();

        int sum = 0;
        while (true) {
            String T = sc.next();
            if ("END_OF_TEXT".equals(T)) break;

            StringBuilder tmp = new StringBuilder();
            for(String s : T.split("")) {
                if (Character.isLetter(s.charAt(0))) tmp.append(s);
            }

            if (tmp.toString().equals(W)) sum++;
        }
        System.out.println(sum);
    }
}