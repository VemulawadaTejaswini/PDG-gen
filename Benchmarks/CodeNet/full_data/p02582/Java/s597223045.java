
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            String str = scanner.nextLine();
            int res = 0;
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'R') {
                    count++;
                } else {
                    count = 0;
                }
                res = Math.max(res, count);
            }
            System.out.println(res);
        }
    }

}
