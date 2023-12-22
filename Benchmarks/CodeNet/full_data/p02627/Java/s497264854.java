

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);
        if(Character.isUpperCase(c)) {
            System.out.println("A");
        } else {
            System.out.println("a");
        }
    }
}
