import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final String s = sc.next();
        final long k = sc.nextLong();
        if (s.length() == 1) {
            System.out.println(s.charAt(0));
            return;
        }
        if (s.charAt(0) == '1') {
            if (k <= 1) {
                System.out.print(1);
            } else {
                System.out.println(s.charAt(1));
            }
        } else {
            System.out.println(s.charAt(0));
        }
    }
}
