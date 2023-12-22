import java.util.*;

public class Main{
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long a = scan.nextInt();
    long b = scan.nextInt();
    long c = scan.nextInt();
    long d = scan.nextInt();

    long prod = Math.max(Math.max(a * c,a*d), Math.max(b*c,b*d));
    System.out.println(prod);
    scan.close();
}
}
