import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c1 = sc.next();
        String c2 = new StringBuffer(sc.next()).reverse().toString();
        if(c1.equals(c2)) System.out.println("Yes");
        else System.out.println("No");
    }
}