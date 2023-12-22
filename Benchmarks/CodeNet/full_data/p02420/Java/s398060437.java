import java.util.Scanner;

public class Main {

    public String shffl(String inS, int num) {
        String buf1 = inS.substring(0, num);
        String buf2 = inS.substring(num, inS.length());
        inS = buf2.concat(buf1);
        return inS;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Main app = new Main();

        while(true) {
            String pattern = scan.next();
            if (pattern.equals("-")) break;
            int times = Integer.parseInt(scan.next());
            for (int i = 0; i < times; i++) {
                int num = Integer.parseInt(scan.next());
                pattern = app.shffl(pattern, num);
            }
            System.out.println(pattern);
        }
    }
}
