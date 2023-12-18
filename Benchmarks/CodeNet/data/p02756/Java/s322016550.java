
import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int Q = Integer.valueOf(sc.nextLine());
        boolean reverse = false;
        StringBuilder sb = new StringBuilder(S);
        StringBuilder left = new StringBuilder();
        StringBuilder right = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            String input = sc.nextLine();
            if(input.charAt(0) == '1'){
                reverse ^= true;
                continue;
            }
            String[] as = input.split(" ");
            if(as[1].equals("1") && !reverse || as[1].equals("2") && reverse) {
                left.append(as[2]);
            } else {
                right.append(as[2]);
            }
        }

        if(reverse){
            System.out.println(right.reverse().append(sb.reverse()).append(left));
        } else {
            System.out.println(left.reverse().append(sb).append(right));
        }
    }
}
