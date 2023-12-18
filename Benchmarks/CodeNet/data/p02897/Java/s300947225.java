package st;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x=in.nextFloat();
        if (x >= 1 && x <= 100) {
            if (x % 2 == 0) {
                System.out.println(0.5);
            } else {
                System.out.println((((x-1)/2)+1)/x);
            }
        }
    }
}
