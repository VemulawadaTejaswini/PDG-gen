import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("A")) System.out.println("T");
        if (s.equals("T")) System.out.println("A");
        if (s.equals("C")) System.out.println("G");
        if (s.equals("G")) System.out.println("C");
        sc.close();
    }
}
