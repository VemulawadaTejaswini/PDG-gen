import java.util.Scanner;

/**
 * Transformation
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        int q = scan.nextInt();
        String cmond;
        int a,b;

        for (int i=0; i < q; i++) {
            cmond = scan.next();
            a = scan.nextInt();
            b = scan.nextInt();
            if (cmond.equals("replace")) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(str);
                buffer.replace(a, b + 1, scan.next());
                str = buffer.toString();
            } else if (cmond.equals("reverse")) {
                if (str.length() > b) {
                    StringBuffer buffer = new StringBuffer();
                    buffer.append(str.substring(a, b + 1));
                    buffer.reverse();
                    if (a > 0) {
                        str = str.substring(0, a) + buffer.toString() + str.substring(b + 1, str.length());
                    } else {
                        str = buffer.toString() + str.substring(b + 1, str.length());
                    }
                }
            } else if (cmond.equals("print")) {
                System.out.println(str.substring(a, b + 1));
            }
        }
        scan.close();
    }
}