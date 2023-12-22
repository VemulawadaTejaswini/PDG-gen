
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();

        int count = 0;
        String s = null;
        for (int i = 0; i < 3; i++) {
            if (n1.substring(i, i + 1).equals(s) || count == 0) {
               if(n1.substring(i, i + 1).equals("R")) {
                   count++;
               }
            }
            s = n1.substring(i, i + 1);
        }

        p(String.valueOf(count));
    }

    static void p(String s) { System.out.println(s); }
}
