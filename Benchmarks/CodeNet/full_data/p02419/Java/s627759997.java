import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pattern = scan.next();
        String buf;
        int count = 0;

        while(!((buf = scan.next()).equals("END_OF_TEXT"))) {
            if (pattern.equalsIgnoreCase(buf)) count++;
        }

        System.out.println(count);
    }
}

