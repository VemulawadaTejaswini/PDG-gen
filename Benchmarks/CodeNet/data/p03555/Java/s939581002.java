import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = sc.next();
        StringBuilder sb = new StringBuilder(c2);
        sb.reverse();
        c2 = sb.toString();
        if(c2.equals(c1)) System.out.println("Yes");
        else System.out.println("No");
    }
}