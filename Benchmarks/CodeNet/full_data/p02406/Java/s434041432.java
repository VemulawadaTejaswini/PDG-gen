import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i < -~n; i++) {
            if(i % 3 == 0) {
                System.out.print(" " + i);
            } else {
                for(int x = i; x > 0; x /= 10) {
                    if(x % 10 == 3) {
                        System.out.print(" " + i);
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}