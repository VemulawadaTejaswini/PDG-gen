import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for (int i = 0 ; i < s.length() ; i++) {
            int n = Integer.valueOf(s.substring(i, i+1));
            c += n;
        }
        System.out.println(c % 9 == 0 ? "Yes" : "No");

    }

}
