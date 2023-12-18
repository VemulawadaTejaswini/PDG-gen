import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean c = true;
        for (int i = 0 ; i < a.length(); i++) {
            if (!a.substring(i, i + 1).equals(b.substring(2-i, 3-i))) {
                c = false;
            }
        }
        if (c) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}