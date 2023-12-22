import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean finish = false;
        int count = 0;
        while(!finish) {
            int i = new Scanner(System.in).nextInt();
            if (i == 0) {
                finish = true;
            } else {
                System.out.println("Case " + ++count + ": " + i);
            }
        }
    }
}
