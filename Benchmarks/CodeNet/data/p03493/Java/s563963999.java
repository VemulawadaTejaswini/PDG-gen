import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String a = scan.next();
                String b = scan.next();
                String c = scan.next();

                int count = 0;
                if("1".equals(a))
                    count++;

                if("1".equals(b))
                    count++;
                if("1".equals(c))
                    count++;
                System.out.print(count);

            }
}
