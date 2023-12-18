import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        String[] sl = s.split("");
        if (sl[k-1].equals("A")) {
            sl[k-1] = "a";
        } else if (sl[k-1].equals("B")) {
            sl[k-1] = "b";
        } else if (sl[k-1].equals("C")) {
            sl[k-1] = "c";
        }
        System.out.println(String.join("", sl));
    }

}
