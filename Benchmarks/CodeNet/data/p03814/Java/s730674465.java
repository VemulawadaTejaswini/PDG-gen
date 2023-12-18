import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] cs = s.toCharArray();

        int mini = 0;
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == 'A') {
                mini = i;
                break;
            }
        }

        int maxi = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
            if (cs[i] == 'Z') {
                maxi = i;
                break;
            }
        }
        System.out.println(maxi - mini + 1);
    }
}
