import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        char C = s.charAt(k - 1);
        String c = String.valueOf(C);
        String[] str = new String[2];
        str = s.split(c);
        System.out.print(str[0]);
        System.out.print(c.toLowerCase());
        System.out.println(str[1]);
    }
}