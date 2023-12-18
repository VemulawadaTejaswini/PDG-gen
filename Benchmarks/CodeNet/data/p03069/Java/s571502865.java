import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();

        int allW = 0;
        for (char s : S.toCharArray()) {
            if (s == '#') {
                allW += 1;
            }
        }

        int allB = 0;
        boolean flag = false;
        for (char s : S.toCharArray()) {
            if (s == '#') {
                flag = true;
            }
            if (flag && s == '.') {
                allB += 1;
            }
        }

        if (allW < allB) {
            System.out.println(allW);
        } else {
            System.out.println(allB);
        }
    }
}
