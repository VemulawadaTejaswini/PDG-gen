import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ArrayList<String> ls = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        while (scan.hasNext()) {
            String s = scan.nextLine();
            if (!s.equals("")) {
                ls.add(s);
            }
        }
        Collections.sort(ls);

        System.out.println(ls.get(0));
    }
}