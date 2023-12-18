import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.next().split("");
        String[] b = sc.next().split("");
        if (a.length > b.length) {
            System.out.println("GREATER");
            return;
        }
        if (a.length < b.length) {
            System.out.println("LESS");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (Integer.parseInt(a[i]) > Integer.parseInt(b[i])) {
                System.out.println("GREATER");
                return;
            }
            if (Integer.parseInt(a[i]) < Integer.parseInt(b[i])) {
                System.out.println("LESS");
                return;
            }
        }
        System.out.println("EQUAL");
    }

}
