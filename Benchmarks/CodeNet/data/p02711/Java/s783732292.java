import java.util.Scanner;

public class Main {

    public static boolean sev(int n) {
        String s = String.valueOf(n);
        char[] ch = s.toCharArray();

        for ( char c : ch ) {
            if ( c == '7' ){
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sev(n));
    }
}
