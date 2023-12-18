import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        char[] o = sc.next().toCharArray();
        char[] t = sc.next().toCharArray();
        for (int i = 0 ; i < t.length ; i++) {
            System.out.print(o[i]);
            System.out.print(t[i]);
        }
        if (t.length  == o.length) {
            System.out.print("\n");
        } else {
            System.out.print(o[o.length - 1] + "\n");
        }
    }

}