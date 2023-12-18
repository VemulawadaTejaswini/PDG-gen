import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        String s = sc.next();
        String n = "";
        for (int i = 0; i < 3; i++) {
            n += s.charAt(i) == '9' ? '1' : '9';
        }
        System.out.println(n);
    }
}