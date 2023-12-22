import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        StringBuilder sb1 = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '?') {
                sb1.append("D");
            } else {
                sb1.append(x.charAt(i));
            }
        }

        System.out.println(sb1);

        sc.close();
    }

}
