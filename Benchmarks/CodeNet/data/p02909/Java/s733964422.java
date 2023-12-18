import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class captain {
    public static void main(String[] args) {
        String str = null;
        Scanner cin = new Scanner(System.in);
        str = cin.next();
        if (str.equals("Sunny"))
            System.out.println("Cloudy");
        else if (str.equals("Cloudy"))
            System.out.println("Rainy");
        else if (str.equals("Rainy")) {
            System.out.println("Sunny");
        }
    }
}