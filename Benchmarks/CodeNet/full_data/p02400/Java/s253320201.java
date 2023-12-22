import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int inta = Integer.parseInt(str);

        System.out.printf("%f %f", (double)inta*inta*Math.PI, (inta+inta)*Math.PI );

    }

}