import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        StringBuilder b = new StringBuilder(s.length()/2);
        for (int i = 1; i <= s.length(); i += 2) {
            b.append(s.substring(i-1, i));
        }

        System.out.println(b.toString());
    }

}