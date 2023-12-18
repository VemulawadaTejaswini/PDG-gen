import java.util.Scanner;

public class Main {
    void run() {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int w = scan.nextInt();
        for (int i = 0; i < s.length(); i += w)
            System.out.print(s.charAt(i));
        System.out.println();
    }
    public static void main(String[] args) {
        new Main().run();
    }
}
