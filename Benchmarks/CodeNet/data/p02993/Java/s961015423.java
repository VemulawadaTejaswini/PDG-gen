import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "Good";

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(s.substring(i+1,i+2))) {
                ans = "Bad";
                break;
            }
        }

        System.out.println(ans);

    }
}