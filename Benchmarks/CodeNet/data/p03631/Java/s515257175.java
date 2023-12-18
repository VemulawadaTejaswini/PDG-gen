import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.next().split("");
        String[] reverseN = new String[n.length];
        for (int i = 0; i < n.length; i++) {
            reverseN[n.length - i - 1] = n[i];
        }
        for (int i = 0; i < n.length; i++) {
            if (!n[i].equals(reverseN[i])) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }

}
