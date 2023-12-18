import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int l = 0;
        int r = 0;
        for (int i = 0 ; i < s.length ; i++) {
            if (s[i] == 'A') {
                l = i;
                break;
            }
        }
        for (int i = s.length - 1 ; i >= 0 ; i--) {
            if (s[i] == 'Z') {
                r = i;
                break;
            }
        }

//        for (int i = l ; i <= r ; i++) {
//            System.out.print(s[i]);
//        }
        System.out.print(r - l + 1);

    }

}