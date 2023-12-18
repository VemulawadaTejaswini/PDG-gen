import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        System.out.println(CapitalHead(a) + CapitalHead(b) + CapitalHead(c));
    }

    public static String CapitalHead(String s) {
        return s.toUpperCase().substring(0, 1);
    }
}