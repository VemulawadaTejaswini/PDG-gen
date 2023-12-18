import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        System.out.println(
            (a.substring(a.length()-1,a.length()).equals(b.substring(0,1)) &&
             b.substring(b.length()-1,b.length()).equals(c.substring(0,1))) ? "YES" : "NO");
    }

}