import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        char[] c = s.toCharArray();
        System.out.println(c[2] == c[3] && c[4] == c[5] ? "Yes" : "No");

    }

}
