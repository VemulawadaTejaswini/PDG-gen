import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int first = 0;
        for (int i = 0 ; i < s.length() ; i++ ) {
            if (s.charAt(i) == 'A') {
                first = i ;
                break;
            }
        }
        int last = 0;
        for (int i = s.length() - 1 ; i >= 0 ; i-- ) {
            if (s.charAt(i) == 'Z') {
                last = i;
                break;
            }
        }

        System.out.println(last - first + 1);
    }

}