import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isOdd = true;
        boolean wrong = false;
        for (char c : s.toCharArray()) {
            if (isOdd) {
                if (c == 'R' || c == 'U' || c == 'D'){

                } else {
                    wrong = true;
                    break;
                }
            } else {
                if (c == 'L' || c == 'U' || c == 'D'){
                } else {
                    wrong = true;
                    break;
                }
            }
            isOdd = !isOdd;
        }
        if (wrong) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
