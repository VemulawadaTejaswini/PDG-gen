import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int i;
        while (true) {

            Scanner sc = new Scanner(System.in);
            String line = sc.next();
            int t;
            int sum=0;

            for (i = 0; i < line.length(); i++) {

                t = line.charAt(i) - '0';
                sum +=t;
                if (sum == 0) {
                    break;
                }

            }
            System.out.println(sum);
        }
    }
}

