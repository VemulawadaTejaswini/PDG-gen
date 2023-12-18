import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            String s2 = in.next();
            String s3 = in.next();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            sb.append(s2.charAt(0));
            sb.append(s3.charAt(0));
            System.out.println(sb.toString().toUpperCase());
        }
    }
}
