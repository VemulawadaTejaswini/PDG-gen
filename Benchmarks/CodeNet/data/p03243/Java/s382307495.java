import java.util.Scanner;

public class Main implements Runnable {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Thread(null, new Main(), "", 128 * 1024 * 1024).start();
    }

    public void run() {
        int n = sc.nextInt();
        while (true) {
            String s = String.valueOf(n);
            char c = s.charAt(0);
            boolean f = true;
            for (int i = 1; i < s.length(); i++) {
                if (c != s.charAt(i)) {
                    f = false;
                    break;
                }
            }
            if(f){
                break;
            }
            n++;
        }
        System.out.println(n);
    }
}