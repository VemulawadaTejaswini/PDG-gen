import java.util.*;

class Main {
    private static Scanner sc;

    public static void main(final String[] args) {
        sc = new Scanner(System.in);
        String a = sc.next(),b = sc.next();
        if(a.equals(b.substring(0,a.length()))) System.out.println("Yes");
        else System.out.println("No");
    }
}






