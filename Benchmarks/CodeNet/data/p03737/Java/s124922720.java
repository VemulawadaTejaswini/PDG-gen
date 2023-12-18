import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

        String a = s1.toUpperCase().substring(0,1);
        String b = s2.toUpperCase().substring(0,1);
        String c = s3.toUpperCase().substring(0,1);

        System.out.println(a+b+c);
    }
}
