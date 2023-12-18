import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String s = String.valueOf(N);

        if (s.charAt(0) == '7' || s.charAt(1) == '7' || s.charAt(2) == '7') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
