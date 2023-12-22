import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String item = inp.next();

        while (!item.equals("0")) {
            String[] items = item.split("");

            long total = 0;

            for (String st : items) {
                total += Long.parseLong(st);
            }

            System.out.println(total);

            item = inp.next();
        }
    }
}

