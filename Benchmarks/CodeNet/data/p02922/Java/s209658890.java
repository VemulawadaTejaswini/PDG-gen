import java.util.Scanner;

import static java.lang.Math.ceil;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double add = sc.nextDouble()-1;
        double total = sc.nextDouble()-1;

        System.out.println((int)ceil(total/add));
    }
}